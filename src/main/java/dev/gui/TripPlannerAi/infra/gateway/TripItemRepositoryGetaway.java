package dev.gui.TripPlannerAi.infra.gateway;

import dev.gui.TripPlannerAi.core.gateway.TripItemGateway;
import dev.gui.TripPlannerAi.infra.persistence.TripItemEntity;
import dev.gui.TripPlannerAi.infra.persistence.TripItemRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TripItemRepositoryGetaway implements TripItemGateway {
    private final TripItemRepository tripItemRepository;

    public TripItemRepositoryGetaway(TripItemRepository tripItemRepository) {
        this.tripItemRepository = tripItemRepository;
    }

    @Override
    public TripItemEntity criar(TripItemEntity tripItem) {
        return tripItemRepository.save(tripItem);
    }

    @Override
    public List<TripItemEntity> listar() {
        return tripItemRepository.findAll();
    }

    @Override
    public Optional<TripItemEntity> listarPorId(Long id) {
        return tripItemRepository.findById(id);
    }

    @Override
    public TripItemEntity atualizarPorId(Long id, TripItemEntity tripItem) {
        return tripItemRepository.save(tripItem);
    }

    @Override
    public void deletar(Long id) {
        tripItemRepository.deleteById(id);
    }
}
