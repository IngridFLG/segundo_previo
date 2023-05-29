package com.ufps.segundo_previo.repositories;

import com.ufps.segundo_previo.entities.SeleccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeleccionRepository extends JpaRepository<SeleccionEntity,Integer> {
    public List<SeleccionEntity> findByGrup(String grupo);
}
