package dev.gui.TripPlannerAi.core.usecases.gemini;

import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;
import reactor.core.publisher.Mono;

import java.util.List;

public interface GeminiUsecase {
    Mono<String> execute(List<TripItemEntity> tripItemList);
}
