package dev.gui.TripPlannerAi.core.entities;

import java.time.LocalDate;

public record TripItem(
    Long id,
    String destino,
    Double orcamento,
    Integer duracao,
    Integer qtdPessoas,
    LocalDate dataViagem){}
