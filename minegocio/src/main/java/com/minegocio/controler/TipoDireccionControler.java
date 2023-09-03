package com.minegocio.controler;

import com.minegocio.entity.TipoDireccion;
import com.minegocio.service.TipoDireccionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author elvis
 */
@RestController
@RequestMapping("api/v1/tipodireccion")
public class TipoDireccionControler {
    
    @Autowired
    private TipoDireccionService tipodireccionservice;
    
    @GetMapping
    public List<TipoDireccion> listar(){
        return tipodireccionservice.listar();
    }
    
    @PostMapping
    public TipoDireccion insertar(@RequestBody TipoDireccion tipo){
        return tipodireccionservice.insertar(tipo);
    }
    
    @PutMapping
    public TipoDireccion actualizar (@RequestBody TipoDireccion tipo) {
        return tipodireccionservice.actualizar(tipo);
    }
    
    @DeleteMapping
    public void eliminar (@RequestBody TipoDireccion tipo) {
        tipodireccionservice.eliminar(tipo);
    }
    
}
