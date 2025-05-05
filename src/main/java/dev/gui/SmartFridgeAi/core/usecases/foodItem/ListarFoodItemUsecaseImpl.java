package dev.gui.SmartFridgeAi.core.usecases.foodItem;

import dev.gui.SmartFridgeAi.core.gateway.FoodItemGateway;
import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;

import java.util.List;

public class ListarFoodItemUsecaseImpl implements ListarFoodItemUsecase{
    private final FoodItemGateway foodItemGateway;

    public ListarFoodItemUsecaseImpl(FoodItemGateway foodItemGateway) {
        this.foodItemGateway = foodItemGateway;
    }

    @Override
    public List<FoodItemEntity> execute() {
        return foodItemGateway.listar();
    }
}
