package dev.gui.TripPlannerAi.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TripItemRepository extends JpaRepository<TripItemEntity, Long> {
}
