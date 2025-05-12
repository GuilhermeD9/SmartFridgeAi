package dev.gui.TripPlannerAi.infra.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "trip_item")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TripItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String destino;
    private Double orcamento;
    private Integer duracao;
    private Integer qtdPessoas;
    private LocalDate dataViagem;
}
