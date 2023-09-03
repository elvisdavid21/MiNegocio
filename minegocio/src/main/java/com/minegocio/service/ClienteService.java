package com.minegocio.service;

import com.minegocio.entity.Cliente;
import com.minegocio.repo.ClienteRepo;
import com.minegocio.repo.DireccionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elvis
 */
@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepo clienterepo;
    
    @Autowired
    private DireccionRepo direccionrepo;
    
    public Cliente insertar (Cliente cli){
        return clienterepo.save(cli);
    }
    
    public Cliente actualizar (Cliente cli) {
        return clienterepo.save(cli);
    }
    
    public List<Cliente> listar() {
        return clienterepo.findAll();
    }
    
    public void eliminar (Cliente cli) {
        clienterepo.delete(cli);
    }
    
    public Cliente buscarPorIdentificationNumber(String identificationNumber) {
        return clienterepo.findByIdentificationNumber(identificationNumber).orElse(null); 
    }
}
