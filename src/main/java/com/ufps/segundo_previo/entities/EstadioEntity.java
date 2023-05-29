package com.ufps.segundo_previo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="estadio")
public class EstadioEntity {

    @Id
    @SequenceGenerator(name="estadio_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="estadio_id_seq")
    private Integer id;


    private String nombre;


    private Integer capacidad;

}
