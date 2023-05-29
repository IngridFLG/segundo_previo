package com.ufps.segundo_previo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="seleccion")
public class SeleccionEntity {

    @Id
    @SequenceGenerator(name="seleccion_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seleccion_id_seq")
    private Integer id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name="continente_id")
    private ContinenteEntity continente;

    private String grupo;
}
