package dev.gui.SmartFridgeAi.core.gateway;

import dev.gui.SmartFridgeAi.infra.persistence.FoodItemEntity;

import java.util.List;
import java.util.Optional;

public interface FoodItemGateway {
    FoodItemEntity criar(FoodItemEntity foodItem);

    List<FoodItemEntity> listar();

    Optional<FoodItemEntity> listarPorId(Long id);

    FoodItemEntity atualizarPorId(Long id, FoodItemEntity foodItem);

    void deletar(Long id);
}
