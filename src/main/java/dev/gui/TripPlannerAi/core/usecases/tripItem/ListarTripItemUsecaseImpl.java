package dev.gui.TripPlannerAi.core.usecases.tripItem;

import dev.gui.TripPlannerAi.core.gateway.TripItemGateway;
import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;

import java.util.List;

public class ListarTripItemUsecaseImpl implements ListarTripItemUsecase {
    private final TripItemGateway tripItemGateway;

    public ListarTripItemUsecaseImpl(TripItemGateway tripItemGateway) {
        this.tripItemGateway = tripItemGateway;
    }

    @Override
    public List<TripItemEntity> execute() {
        return tripItemGateway.listar();
    }
}
