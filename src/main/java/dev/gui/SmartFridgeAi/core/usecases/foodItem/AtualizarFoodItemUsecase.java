package dev.gui.SmartFridgeAi.core.usecases.foodItem;

import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;

public interface AtualizarFoodItemUsecase {
    FoodItemEntity execute(Long id, FoodItemEntity foodItem);
}
