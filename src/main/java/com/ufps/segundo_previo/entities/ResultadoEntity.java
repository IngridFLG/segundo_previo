package com.ufps.segundo_previo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="resultado")
public class ResultadoEntity {

    @Id
    @SequenceGenerator(name="resultado_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="resultado_id_seq")
    private Integer id;

    private Integer goles;

    private Integer amarillas;

    private Integer rojas;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="partido_id")
    private PartidoEntity partido;

    @ManyToOne
    @JoinColumn(name="seleccion_id")
    private SeleccionEntity seleccion;
}
