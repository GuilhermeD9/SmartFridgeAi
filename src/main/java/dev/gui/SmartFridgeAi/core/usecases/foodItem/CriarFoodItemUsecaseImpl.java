package dev.gui.SmartFridgeAi.core.usecases.foodItem;

import dev.gui.SmartFridgeAi.core.gateway.FoodItemGateway;
import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;

public class CriarFoodItemUsecaseImpl implements CriarFoodItemUsecase {
    private final FoodItemGateway foodItemGateway;

    public CriarFoodItemUsecaseImpl(FoodItemGateway foodItemGateway) {
        this.foodItemGateway = foodItemGateway;
    }

    @Override
    public FoodItemEntity execute(FoodItemEntity foodItem) {
        return foodItemGateway.criar(foodItem);
    }
}
