package com.fabervelez.AA07_EVIDENCIA01.servicio;

import com.fabervelez.AA07_EVIDENCIA01.modelo.Cliente;
import com.fabervelez.AA07_EVIDENCIA01.repositorio.RepocitorioCliente;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionServicio implements ServicioCliente{
    
    @Autowired
    private RepocitorioCliente repositorioCliente;

    @Override
    public Cliente newCliente(Cliente newCliente) {
        return repositorioCliente.save(newCliente);
    }

    @Override
    public Iterable<Cliente> getAll() {
        return this.repositorioCliente.findAll();
    }

    @Override
    public Cliente modifyCliente(Cliente cliente) {
        
        Optional<Cliente> clienteEncontrado = this.repositorioCliente.findById(cliente.getIdcliente());
        if(clienteEncontrado.get() != null){
            clienteEncontrado.get().setNombre(cliente.getNombre());
            clienteEncontrado.get().setApellido(cliente.getApellido());
            clienteEncontrado.get().setEmal(cliente.getEmal());
            return this.newCliente(clienteEncontrado.get());
        }
        
        return null;
    }

    @Override
    public Boolean deleteCliente(Long idcliente) {
        this.repositorioCliente.deleteById(idcliente);
        return true;
    }
    
}
