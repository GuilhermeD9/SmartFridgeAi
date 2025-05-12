package dev.gui.TripPlannerAi.infra.config;

import dev.gui.TripPlannerAi.core.gateway.TripItemGateway;
import dev.gui.TripPlannerAi.core.gateway.GeminiGetaway;
import dev.gui.TripPlannerAi.core.usecases.tripItem.*;
import dev.gui.TripPlannerAi.core.usecases.gemini.GeminiUsecase;
import dev.gui.TripPlannerAi.core.usecases.gemini.GeminiUsecaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public CriarTripItemUsecase criarTripItem(TripItemGateway gateway) {
        return new CriarTripItemUsecaseImpl(gateway);
    }

    @Bean
    public ListarTripItemUsecase listarTripItem(TripItemGateway gateway) {
        return new ListarTripItemUsecaseImpl(gateway);
    }

    @Bean
    public AtualizarTripItemUsecase atualizarTripItem(TripItemGateway gateway) {
        return new AtualizarTripItemUsecaseImpl(gateway);
    }

    @Bean
    public DeletarTripItemUsecase deletarTripItem(TripItemGateway gateway) {
        return new DeletarTripItemUsecaseImpl(gateway);
    }

    @Bean
    public FiltrarIdTripItemUsecase filtrarPorIdTripItem(TripItemGateway gateway) {
        return new FiltrarIdTripItemUsecaseImpl(gateway);
    }

    @Bean
    GeminiUsecase generateTrip(GeminiGetaway getaway) {
        return new GeminiUsecaseImpl(getaway);
    }
}
