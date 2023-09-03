package com.minegocio.repo;

import com.minegocio.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elvis
 */
@Repository
public interface DireccionRepo extends JpaRepository<Direccion, Integer>{
    @Query("SELECT COUNT(d) > 0 FROM Direccion d WHERE d.cliente.idCliente = :clienteId AND d.tipoDireccion.idTipoDireccion = 1")
    boolean existeDireccionMatriz(@Param("clienteId") Integer clienteId);
}
