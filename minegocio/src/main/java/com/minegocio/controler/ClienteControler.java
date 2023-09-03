package com.minegocio.controler;

import com.minegocio.entity.Cliente;
import com.minegocio.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("api/v1/clientes")
public class ClienteControler {
    
    @Autowired
    private ClienteService clienteservice;
    
    @GetMapping
    public List<Cliente> listar(){
        return clienteservice.listar();
    }
    
    @PostMapping
    public Cliente insertar(@RequestBody Cliente cli){
        return clienteservice.insertar(cli);
    }
    
    @PutMapping
    public Cliente actualizar (@RequestBody Cliente cli) {
        return clienteservice.actualizar(cli);
    }
    
    @DeleteMapping
    public void eliminar (@RequestBody Cliente cli) {
        clienteservice.eliminar(cli);
    }
    
    @GetMapping("/{identificationNumber}")
    public ResponseEntity<Cliente> buscarClientePorIdentificationNumber(@PathVariable String identificationNumber) {
    Cliente cliente = clienteservice.buscarPorIdentificationNumber(identificationNumber);
    if (cliente != null) {
        return ResponseEntity.ok(cliente);
    }else {
        return ResponseEntity.notFound().build();
    }
    }
}
