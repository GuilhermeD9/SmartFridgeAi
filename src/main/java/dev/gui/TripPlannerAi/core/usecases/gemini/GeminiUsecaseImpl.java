package dev.gui.TripPlannerAi.core.usecases.gemini;

import dev.gui.TripPlannerAi.core.gateway.GeminiGetaway;
import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;
import reactor.core.publisher.Mono;

import java.util.List;

public class GeminiUsecaseImpl implements GeminiUsecase{
    private final GeminiGetaway geminiGetaway;

    public GeminiUsecaseImpl(GeminiGetaway geminiGetaway) {
        this.geminiGetaway = geminiGetaway;
    }

    @Override
    public Mono<String> execute(List<TripItemEntity> tripItemList) {
        return geminiGetaway.generateRecipe(tripItemList);
    }
}
