package dev.gui.TripPlannerAi.core.usecases.tripItem;

import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;

public interface CriarTripItemUsecase {
    TripItemEntity execute(TripItemEntity tripItem);
}
