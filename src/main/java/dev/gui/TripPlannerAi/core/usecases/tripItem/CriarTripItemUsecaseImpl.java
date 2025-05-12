package dev.gui.TripPlannerAi.core.usecases.tripItem;

import dev.gui.TripPlannerAi.core.gateway.TripItemGateway;
import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;

public class CriarTripItemUsecaseImpl implements CriarTripItemUsecase {
    private final TripItemGateway tripItemGateway;

    public CriarTripItemUsecaseImpl(TripItemGateway tripItemGateway) {
        this.tripItemGateway = tripItemGateway;
    }

    @Override
    public TripItemEntity execute(TripItemEntity tripItem) {
        return tripItemGateway.criar(tripItem);
    }
}
