package dev.gui.SmartFridgeAi.controller;

import dev.gui.SmartFridgeAi.service.GeminiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class RecipeController {

    private GeminiService geminiService;

    public RecipeController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }

    @GetMapping("/generate")
    public ResponseEntity<Mono<String>> generateRecipe() {
        Mono<String> newRecipe = geminiService.generateRecipe();
        return ResponseEntity.status(HttpStatus.OK).body(newRecipe);
    }
}
