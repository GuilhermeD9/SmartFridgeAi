package dev.gui.TripPlannerAi.core.usecases.tripItem;

import dev.gui.TripPlannerAi.core.gateway.TripItemGateway;
import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;

public class AtualizarTripItemUsecaseImpl implements AtualizarTripItemUsecase {
    private final TripItemGateway tripItemGateway;

    public AtualizarTripItemUsecaseImpl(TripItemGateway tripItemGateway) {
        this.tripItemGateway = tripItemGateway;
    }

    @Override
    public TripItemEntity execute(Long id, TripItemEntity foodItem) {
        return tripItemGateway.atualizarPorId(id, foodItem);
    }
}
