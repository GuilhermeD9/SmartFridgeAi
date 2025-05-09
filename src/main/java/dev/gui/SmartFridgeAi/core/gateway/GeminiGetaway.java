package dev.gui.SmartFridgeAi.core.gateway;

import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;
import reactor.core.publisher.Mono;

import java.util.List;

public interface GeminiGetaway {
    Mono<String> generateRecipe(List<FoodItemEntity> foodItemList);
}
