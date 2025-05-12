package dev.gui.TripPlannerAi.infra.presentation;

import dev.gui.TripPlannerAi.core.usecases.tripItem.*;
import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trip")
public class TripItemController {
    private CriarTripItemUsecase criarTripItemUsecase;
    private AtualizarTripItemUsecase atualizarTripItemUsecase;
    private DeletarTripItemUsecase deletarTripItemUsecase;
    private FiltrarIdTripItemUsecase filtrarIdTripItemUsecase;
    private ListarTripItemUsecase listarTripItemUsecase;

    public TripItemController(CriarTripItemUsecase criarTripItemUsecase, AtualizarTripItemUsecase atualizarTripItemUsecase,
                              DeletarTripItemUsecase deletarTripItemUsecase, FiltrarIdTripItemUsecase filtrarIdTripItemUsecase,
                              ListarTripItemUsecase listarTripItemUsecase) {
        this.criarTripItemUsecase = criarTripItemUsecase;
        this.atualizarTripItemUsecase = atualizarTripItemUsecase;
        this.deletarTripItemUsecase = deletarTripItemUsecase;
        this.filtrarIdTripItemUsecase = filtrarIdTripItemUsecase;
        this.listarTripItemUsecase = listarTripItemUsecase;
    }

    @PostMapping
    public ResponseEntity<TripItemEntity> criar(@RequestBody TripItemEntity tripItem) {
        TripItemEntity salvo = criarTripItemUsecase.execute(tripItem);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping
    public ResponseEntity<List<TripItemEntity>> listar() {
        return ResponseEntity.ok(listarTripItemUsecase.execute());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<TripItemEntity>> listarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(filtrarIdTripItemUsecase.execute(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TripItemEntity> atualizarPorId(@PathVariable Long id, @RequestBody TripItemEntity tripItem) {
        return filtrarIdTripItemUsecase.execute(id)
                .map(itemExistente -> {
                    tripItem.setId(itemExistente.getId());
                    TripItemEntity atualizado = atualizarTripItemUsecase.execute(id, tripItem);
                    return ResponseEntity.ok(atualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        deletarTripItemUsecase.execute(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
