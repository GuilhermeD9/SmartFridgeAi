package dev.gui.SmartFridgeAi.core.usecases.foodItem;

import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;

import java.util.Optional;

public interface FiltrarIdFoodItemUsecase {
    Optional<FoodItemEntity> execute(Long id);
}
