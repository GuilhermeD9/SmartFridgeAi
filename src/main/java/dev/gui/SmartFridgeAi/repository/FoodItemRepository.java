package dev.gui.SmartFridgeAi.repository;

import dev.gui.SmartFridgeAi.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}
