package com.ufps.segundo_previo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name ="partido")
public class PartidoEntity {

    @Id
    @SequenceGenerator(name="partido_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="partido_id_seq")
    private Integer id;

    private Timestamp fecha;

    @JsonIgnore
    @OneToMany(mappedBy="partido")
    private List<ResultadoEntity> resultado;

    @ManyToOne
    @JoinColumn(name="estadio_id")
    private EstadioEntity estadio;

}
