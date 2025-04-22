package dev.gui.SmartFridgeAi.controller;

import dev.gui.SmartFridgeAi.model.FoodItem;
import dev.gui.SmartFridgeAi.service.FoodItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/food")
public class FoodItemController {
    private FoodItemService service;

    public FoodItemController(FoodItemService service) {
        this.service = service;
    }

    public ResponseEntity<FoodItem> criar(@RequestBody FoodItem foodItem) {
        FoodItem salvo = service.salvar(foodItem);
        return ResponseEntity.ok(salvo);
    }

    public ResponseEntity<List<FoodItem>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    public ResponseEntity<Optional<FoodItem>> listarPorId(@RequestParam Long id) {
        return ResponseEntity.ok(service.listarPorId(id));
    }

    public ResponseEntity<Optional<FoodItem>> atualizarPorId(@RequestParam Long id, @RequestBody FoodItem foodItem) {
        return ResponseEntity.ok(Optional.ofNullable(service.atualizar(id, foodItem)));
    }

    public ResponseEntity<Void> deletarPorId(@RequestParam Long id) {
        service.deletar(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
