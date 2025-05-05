package dev.gui.SmartFridgeAi.core.usecases.foodItem;

import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;

public interface CriarFoodItemUsecase {
    FoodItemEntity execute(FoodItemEntity foodItem);
}
