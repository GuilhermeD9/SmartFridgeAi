package dev.gui.SmartFridgeAi.core.usecases.gemini;

import dev.gui.SmartFridgeAi.core.gateway.GeminiGetaway;
import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;
import reactor.core.publisher.Mono;

import java.util.List;

public class GeminiUsecaseImpl implements GeminiUsecase{
    private final GeminiGetaway geminiGetaway;

    public GeminiUsecaseImpl(GeminiGetaway geminiGetaway) {
        this.geminiGetaway = geminiGetaway;
    }

    @Override
    public Mono<String> execute(List<FoodItemEntity> foodItemList) {
        return geminiGetaway.generateRecipe(foodItemList);
    }
}
