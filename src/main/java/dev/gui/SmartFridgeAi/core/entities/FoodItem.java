package dev.gui.SmartFridgeAi.core.entities;

import java.time.LocalDate;

public record FoodItem(
    Long id,
    String nome,
    String categoria,
    Integer quantidade,
    LocalDate validade){}
