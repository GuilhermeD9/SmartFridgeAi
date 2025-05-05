package dev.gui.SmartFridgeAi.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItemEntity, Long> {
}
