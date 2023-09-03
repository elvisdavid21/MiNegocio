package com.minegocio.controler;

import com.minegocio.entity.Direccion;
import com.minegocio.service.DireccionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("api/v1/direcciones")
public class DireccionControler {
    @Autowired
    private DireccionService direccionservice;
    
    @GetMapping
    public List<Direccion> listar(){
        return direccionservice.listar();
    }
    
    @PostMapping
    public Direccion insertar(@RequestBody Direccion dir){
        return direccionservice.insertar(dir);
    }
    
    @PutMapping
    public Direccion actualizar (@RequestBody Direccion dir) {
        return direccionservice.actualizar(dir);
    }
    
    @DeleteMapping
    public void eliminar (@RequestBody Direccion dir) {
        direccionservice.eliminar(dir);
    }
}
