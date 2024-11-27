package com.fabervelez.AA07_EVIDENCIA01.repositorio;

import com.fabervelez.AA07_EVIDENCIA01.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepocitorioCliente extends JpaRepository<Cliente, Long> {
    
}
