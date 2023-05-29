package com.ufps.segundo_previo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="continente")
public class ContinenteEntity {

    @Id
    @SequenceGenerator(name="continente_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="continente_id_seq")
    private Integer id;

    private String nombre;

}
