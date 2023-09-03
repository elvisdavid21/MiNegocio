package com.minegocio.repo;

import com.minegocio.entity.TipoDireccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elvis
 */
@Repository
public interface TipoDireccionRepo extends JpaRepository<TipoDireccion, Integer>{
    
}
