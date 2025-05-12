package dev.gui.TripPlannerAi.infra.gateway;

import dev.gui.TripPlannerAi.core.gateway.GeminiGetaway;
import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class GeminiRepositoryGetaway implements GeminiGetaway {
    private String apiKey = System.getenv("KEY_GEMINI");
    private final WebClient webClient;

    public GeminiRepositoryGetaway(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public Mono<String> generateRecipe(List<TripItemEntity> tripItemList) {
        String infos = tripItemList.stream()
                .map(item -> String.format(
                        "Destino: %s | Orçamento: %s | Duração: %d dias | Pessoas: %d | Data da viagem: %s",
                        item.getDestino(), item.getOrcamento(), item.getDuracao(), item.getQtdPessoas(), item.getDataViagem()
                ))
                .collect(Collectors.joining("\n"));

        String prompt = """
        Com base nas informações abaixo, crie um roteiro de viagem personalizado para cada destino.
        Considere as restrições de orçamento, a duração da viagem, o número de pessoas e a data planejada.
        Adicione sugestões de atividades, hospedagens e deslocamentos. Seja criativo e realista.
        
        Viagens:
        """ + infos;

        Map<String, Object> requestBody = Map.of(
                "contents", List.of(
                        Map.of(
                                "parts", List.of(
                                        Map.of("text", prompt)
                                )
                        )
                )
        );
        return webClient.post()
                .uri(uriBuilder -> uriBuilder
                        .path("/v1beta/models/gemini-2.0-flash:generateContent")
                        .queryParam("key", apiKey)
                        .build())
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(Map.class)
                .map(response -> {
                    var candidates = (List<Map<String, Object>>) response.get("candidates");
                    if (candidates != null && !candidates.isEmpty()) {
                        Map<String, Object> content = (Map<String, Object>) candidates.get(0).get("content");
                        List<Map<String, Object>> parts = (List<Map<String, Object>>) content.get("parts");
                        if (parts != null && !parts.isEmpty()) {
                            return parts.get(0).get("text").toString();
                        }
                    }
                    return "Nenhuma receita foi gerada.";
                });
    }
}
