package com.minegocio.repo;

import com.minegocio.entity.Cliente;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elvis
 */
@Repository
public interface ClienteRepo extends JpaRepository<Cliente, Integer>{
    Optional<Cliente> findByIdentificationNumber(String identificationNumber);
}
