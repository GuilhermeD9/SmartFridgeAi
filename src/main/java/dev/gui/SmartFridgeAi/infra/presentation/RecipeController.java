package dev.gui.SmartFridgeAi.infra.presentation;

import dev.gui.SmartFridgeAi.core.usecases.foodItem.ListarFoodItemUsecase;
import dev.gui.SmartFridgeAi.core.usecases.gemini.GeminiUsecase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class RecipeController {

    private GeminiUsecase geminiUsecase;
    private ListarFoodItemUsecase listarFoodItemUsecase;

    public RecipeController(GeminiUsecase geminiUsecase, ListarFoodItemUsecase listarFoodItemUsecase) {
        this.geminiUsecase = geminiUsecase;
        this.listarFoodItemUsecase = listarFoodItemUsecase;
    }

    @GetMapping("/generate")
    public Mono<ResponseEntity<String>> generateRecipe() {
        return geminiUsecase.execute(listarFoodItemUsecase.execute())
                .map(recipe -> ResponseEntity.ok(recipe))
                .defaultIfEmpty(ResponseEntity.noContent().build());
    }
}
