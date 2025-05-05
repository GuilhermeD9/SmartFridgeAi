package dev.gui.SmartFridgeAi.core.usecases.foodItem;

import dev.gui.SmartFridgeAi.core.gateway.FoodItemGateway;

public class DeletarFoodItemUsecaseImpl implements DeletarFoodItemUsecase{
    private final FoodItemGateway foodItemGateway;

    public DeletarFoodItemUsecaseImpl(FoodItemGateway foodItemGateway) {
        this.foodItemGateway = foodItemGateway;
    }

    @Override
    public void execute(Long id) {
        foodItemGateway.deletar(id);
    }
}
