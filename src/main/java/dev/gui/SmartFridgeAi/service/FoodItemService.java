package dev.gui.SmartFridgeAi.service;

import dev.gui.SmartFridgeAi.model.FoodItem;
import dev.gui.SmartFridgeAi.repository.FoodItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodItemService {
    private FoodItemRepository repository;

    public FoodItemService(FoodItemRepository repository) {
        this.repository = repository;
    }

    public FoodItem salvar(FoodItem foodItem) {
        return repository.save(foodItem);
    }

    public List<FoodItem> listar() {
        return repository.findAll();
    }

    public Optional<FoodItem> listarPorId(Long id) {
        return repository.findById(id);
    }

    public FoodItem atualizar(FoodItem foodItem) {
        return repository.save(foodItem);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    /*
    FAZER TODOS OS OUTROS MÉTODOS
     */
}
