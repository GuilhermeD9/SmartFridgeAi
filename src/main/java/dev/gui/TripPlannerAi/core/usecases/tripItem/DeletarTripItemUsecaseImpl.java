package dev.gui.TripPlannerAi.core.usecases.tripItem;

import dev.gui.TripPlannerAi.core.gateway.TripItemGateway;

public class DeletarTripItemUsecaseImpl implements DeletarTripItemUsecase {
    private final TripItemGateway tripItemGateway;

    public DeletarTripItemUsecaseImpl(TripItemGateway tripItemGateway) {
        this.tripItemGateway = tripItemGateway;
    }

    @Override
    public void execute(Long id) {
        tripItemGateway.deletar(id);
    }
}
