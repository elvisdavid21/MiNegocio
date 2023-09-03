package com.minegocio.service;

import com.minegocio.entity.Direccion;
import com.minegocio.repo.DireccionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elvis
 */
@Service
public class DireccionService {
    @Autowired
    private DireccionRepo direccionrepo;
    
    public Direccion insertar (Direccion dir ) {
        Integer clienteId = dir.getCliente().getIdCliente();
        boolean existeMatriz = direccionrepo.existeDireccionMatriz(clienteId);
        if (existeMatriz) {
            dir.getTipoDireccion().setIdTipoDireccion(2); // Asigna el ID de sucursal (o según corresponda)
        }
        return direccionrepo.save(dir);
    }
    
    public Direccion actualizar (Direccion dir) {
        return direccionrepo.save(dir);
    }
    
    public List<Direccion> listar() {
        return direccionrepo.findAll();
    }
    
    public void eliminar (Direccion dir) {
        direccionrepo.delete(dir);
    }
}
