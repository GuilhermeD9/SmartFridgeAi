package dev.gui.SmartFridgeAi.core.usecases.gemini;

import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;
import reactor.core.publisher.Mono;

import java.util.List;

public interface GeminiUsecase {
    Mono<String> execute(List<FoodItemEntity> foodItemList);
}
