package dev.gui.TripPlannerAi.core.usecases.tripItem;

import dev.gui.TripPlannerAi.core.gateway.TripItemGateway;
import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;

import java.util.Optional;

public class FiltrarIdTripItemUsecaseImpl implements FiltrarIdTripItemUsecase {
    private final TripItemGateway tripItemGateway;

    public FiltrarIdTripItemUsecaseImpl(TripItemGateway tripItemGateway) {
        this.tripItemGateway = tripItemGateway;
    }

    @Override
    public Optional<TripItemEntity> execute(Long id) {
        return tripItemGateway.listarPorId(id);
    }
}
