package dev.gui.SmartFridgeAi.infra.gateway;

import dev.gui.SmartFridgeAi.core.gateway.FoodItemGateway;
import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;
import dev.gui.SmartFridgeAi.infra.persistence.FoodItemRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FoodItemRepositoryGetaway implements FoodItemGateway {
    private final FoodItemRepository foodItemRepository;

    public FoodItemRepositoryGetaway(FoodItemRepository foodItemRepository) {
        this.foodItemRepository = foodItemRepository;
    }

    @Override
    public FoodItemEntity criar(FoodItemEntity foodItem) {
        return foodItemRepository.save(foodItem);
    }

    @Override
    public List<FoodItemEntity> listar() {
        return foodItemRepository.findAll();
    }

    @Override
    public Optional<FoodItemEntity> listarPorId(Long id) {
        return foodItemRepository.findById(id);
    }

    @Override
    public FoodItemEntity atualizarPorId(Long id, FoodItemEntity foodItem) {
        return foodItemRepository.save(foodItem);
    }

    @Override
    public void deletar(Long id) {
        foodItemRepository.deleteById(id);
    }
}
