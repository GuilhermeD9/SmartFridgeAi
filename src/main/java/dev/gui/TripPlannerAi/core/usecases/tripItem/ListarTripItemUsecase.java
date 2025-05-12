package dev.gui.TripPlannerAi.core.usecases.tripItem;

import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;

import java.util.List;

public interface ListarTripItemUsecase {
    List<TripItemEntity> execute();
}
