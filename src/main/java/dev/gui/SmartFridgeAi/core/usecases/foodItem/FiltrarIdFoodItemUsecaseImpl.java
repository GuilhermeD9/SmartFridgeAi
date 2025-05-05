package dev.gui.SmartFridgeAi.core.usecases.foodItem;

import dev.gui.SmartFridgeAi.core.gateway.FoodItemGateway;
import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;

import java.util.Optional;

public class FiltrarIdFoodItemUsecaseImpl implements FiltrarIdFoodItemUsecase {
    private final FoodItemGateway foodItemGateway;

    public FiltrarIdFoodItemUsecaseImpl(FoodItemGateway foodItemGateway) {
        this.foodItemGateway = foodItemGateway;
    }

    @Override
    public Optional<FoodItemEntity> execute(Long id) {
        return foodItemGateway.listarPorId(id);
    }
}
