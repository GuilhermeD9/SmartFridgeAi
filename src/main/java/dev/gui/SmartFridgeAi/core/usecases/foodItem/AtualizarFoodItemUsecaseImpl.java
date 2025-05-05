package dev.gui.SmartFridgeAi.core.usecases.foodItem;

import dev.gui.SmartFridgeAi.core.gateway.FoodItemGateway;
import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;

public class AtualizarFoodItemUsecaseImpl implements AtualizarFoodItemUsecase {
    private final FoodItemGateway foodItemGateway;

    public AtualizarFoodItemUsecaseImpl(FoodItemGateway foodItemGateway) {
        this.foodItemGateway = foodItemGateway;
    }

    @Override
    public FoodItemEntity execute(Long id, FoodItemEntity foodItem) {
        return foodItemGateway.atualizarPorId(id, foodItem);
    }
}
