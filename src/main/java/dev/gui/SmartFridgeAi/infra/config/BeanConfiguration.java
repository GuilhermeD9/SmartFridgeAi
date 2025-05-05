package dev.gui.SmartFridgeAi.infra.config;

import dev.gui.SmartFridgeAi.core.gateway.FoodItemGateway;
import dev.gui.SmartFridgeAi.core.usecases.foodItem.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public CriarFoodItemUsecase criarFoodItem(FoodItemGateway gateway) {
        return new CriarFoodItemUsecaseImpl(gateway);
    }

    @Bean
    public ListarFoodItemUsecase listarFoodItem(FoodItemGateway gateway) {
        return new ListarFoodItemUsecaseImpl(gateway);
    }

    @Bean
    public AtualizarFoodItemUsecase atualizarFoodItem(FoodItemGateway gateway) {
        return new AtualizarFoodItemUsecaseImpl(gateway);
    }

    @Bean
    public DeletarFoodItemUsecase deletarFoodItem(FoodItemGateway gateway) {
        return new DeletarFoodItemUsecaseImpl(gateway);
    }

    @Bean
    public FiltrarIdFoodItemUsecase filtrarPorIdFoodItem(FoodItemGateway gateway) {
        return new FiltrarIdFoodItemUsecaseImpl(gateway);
    }
}
