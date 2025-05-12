package dev.gui.TripPlannerAi.infra.presentation;

import dev.gui.TripPlannerAi.core.usecases.tripItem.ListarTripItemUsecase;
import dev.gui.TripPlannerAi.core.usecases.gemini.GeminiUsecase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GeminiController {

    private GeminiUsecase geminiUsecase;
    private ListarTripItemUsecase listarTripItemUsecase;

    public GeminiController(GeminiUsecase geminiUsecase, ListarTripItemUsecase listarTripItemUsecase) {
        this.geminiUsecase = geminiUsecase;
        this.listarTripItemUsecase = listarTripItemUsecase;
    }

    @GetMapping("/generate")
    public Mono<ResponseEntity<String>> generateRecipe() {
        return geminiUsecase.execute(listarTripItemUsecase.execute())
                .map(recipe -> ResponseEntity.ok(recipe))
                .defaultIfEmpty(ResponseEntity.noContent().build());
    }
}
