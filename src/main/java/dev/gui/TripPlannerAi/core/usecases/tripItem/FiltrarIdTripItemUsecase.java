package dev.gui.TripPlannerAi.core.usecases.tripItem;

import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;

import java.util.Optional;

public interface FiltrarIdTripItemUsecase {
    Optional<TripItemEntity> execute(Long id);
}
