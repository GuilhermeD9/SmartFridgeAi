package dev.gui.TripPlannerAi.core.gateway;

import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;
import reactor.core.publisher.Mono;

import java.util.List;

public interface GeminiGetaway {
    Mono<String> generateRecipe(List<TripItemEntity> tripItemList);
}
