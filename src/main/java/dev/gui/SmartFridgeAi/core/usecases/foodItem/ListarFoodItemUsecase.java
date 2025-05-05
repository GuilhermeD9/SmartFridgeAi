package dev.gui.SmartFridgeAi.core.usecases.foodItem;

import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;

import java.util.List;

public interface ListarFoodItemUsecase {
    List<FoodItemEntity> execute();
}
