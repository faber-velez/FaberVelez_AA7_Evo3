package com.fabervelez.AA07_EVIDENCIA01.controlador;

import com.fabervelez.AA07_EVIDENCIA01.modelo.Cliente;
import com.fabervelez.AA07_EVIDENCIA01.servicio.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Cliente")
public class ControladorCliente {
    
    @Autowired
    private ServicioCliente servicioCliente;
    
    @PostMapping("/nuevo")
    public Cliente newCliente (@RequestBody Cliente newCliente){
        return this.servicioCliente.newCliente(newCliente);
    }
    
    @GetMapping ("/mostrar")
    public Iterable<Cliente> getAll(){
        return servicioCliente.getAll();
    }
    
    @PostMapping ("/modificar")
    public Cliente updateCliente (@RequestBody Cliente cliente){
        return this.servicioCliente.modifyCliente(cliente);
    }
    
    @PostMapping (value="/{id}")
    public Boolean deleteCliente (@PathVariable (value="id")Long id){
        return this.servicioCliente.deleteCliente(id);
    }
}
