package com.minegocio.service;

import com.minegocio.entity.TipoDireccion;
import com.minegocio.repo.TipoDireccionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elvis
 */
@Service
public class TipoDireccionService {
    
    @Autowired
    private TipoDireccionRepo tipodireccionrepo;
    
    public TipoDireccion insertar (TipoDireccion tipo){
        return tipodireccionrepo.save(tipo);
    }
    
    public TipoDireccion actualizar (TipoDireccion tipo) {
        return tipodireccionrepo.save(tipo);
    }
    
    public List<TipoDireccion> listar() {
        return tipodireccionrepo.findAll();
    }
    
    public void eliminar (TipoDireccion tipo) {
        tipodireccionrepo.delete(tipo);
    }
    
}
