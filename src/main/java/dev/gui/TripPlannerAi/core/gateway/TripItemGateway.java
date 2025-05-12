package dev.gui.TripPlannerAi.core.gateway;

import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;

import java.util.List;
import java.util.Optional;

public interface TripItemGateway {
    TripItemEntity criar(TripItemEntity tripItem);

    List<TripItemEntity> listar();

    Optional<TripItemEntity> listarPorId(Long id);

    TripItemEntity atualizarPorId(Long id, TripItemEntity tripItem);

    void deletar(Long id);
}
