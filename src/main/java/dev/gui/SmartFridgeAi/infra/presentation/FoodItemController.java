package dev.gui.SmartFridgeAi.infra.presentation;

import dev.gui.SmartFridgeAi.core.usecases.foodItem.*;
import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/food")
public class FoodItemController {
    private CriarFoodItemUsecase criarFoodItemUsecase;
    private AtualizarFoodItemUsecase atualizarFoodItemUsecase;
    private DeletarFoodItemUsecase deletarFoodItemUsecase;
    private FiltrarIdFoodItemUsecase filtrarIdFoodItemUsecase;
    private ListarFoodItemUsecase listarFoodItemUsecase;

    public FoodItemController(CriarFoodItemUsecase criarFoodItemUsecase, AtualizarFoodItemUsecase atualizarFoodItemUsecase,
                              DeletarFoodItemUsecase deletarFoodItemUsecase, FiltrarIdFoodItemUsecase filtrarIdFoodItemUsecase,
                              ListarFoodItemUsecase listarFoodItemUsecase) {
        this.criarFoodItemUsecase = criarFoodItemUsecase;
        this.atualizarFoodItemUsecase = atualizarFoodItemUsecase;
        this.deletarFoodItemUsecase = deletarFoodItemUsecase;
        this.filtrarIdFoodItemUsecase = filtrarIdFoodItemUsecase;
        this.listarFoodItemUsecase = listarFoodItemUsecase;
    }

    @PostMapping
    public ResponseEntity<FoodItemEntity> criar(@RequestBody FoodItemEntity foodItem) {
        FoodItemEntity salvo = criarFoodItemUsecase.execute(foodItem);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping
    public ResponseEntity<List<FoodItemEntity>> listar() {
        return ResponseEntity.ok(listarFoodItemUsecase.execute());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<FoodItemEntity>> listarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(filtrarIdFoodItemUsecase.execute(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FoodItemEntity> atualizarPorId(@PathVariable Long id, @RequestBody FoodItemEntity foodItem) {
        return filtrarIdFoodItemUsecase.execute(id)
                .map(itemExistente -> {
                    foodItem.setId(itemExistente.getId());
                    FoodItemEntity atualizado = atualizarFoodItemUsecase.execute(id, foodItem);
                    return ResponseEntity.ok(atualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        deletarFoodItemUsecase.execute(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
