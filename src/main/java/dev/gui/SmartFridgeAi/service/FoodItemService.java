package dev.gui.SmartFridgeAi.service;

import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;
import dev.gui.SmartFridgeAi.infra.persistence.FoodItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodItemService {
    private FoodItemRepository repository;

    public FoodItemService(FoodItemRepository repository) {
        this.repository = repository;
    }

    public FoodItemEntity salvar(FoodItemEntity foodItem) {
        return repository.save(foodItem);
    }

    public List<FoodItemEntity> listar() {
        return repository.findAll();
    }

    public Optional<FoodItemEntity> listarPorId(Long id) {
        return repository.findById(id);
    }

    public FoodItemEntity atualizar(FoodItemEntity foodItem) {
        return repository.save(foodItem);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    /*
    FAZER TODOS OS OUTROS MÉTODOS
     */
}
