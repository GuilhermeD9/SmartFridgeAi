package dev.gui.TripPlannerAi.core.usecases.tripItem;

import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;

public interface AtualizarTripItemUsecase {
    TripItemEntity execute(Long id, TripItemEntity tripItem);
}
