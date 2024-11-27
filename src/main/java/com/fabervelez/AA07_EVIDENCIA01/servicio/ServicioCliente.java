package com.fabervelez.AA07_EVIDENCIA01.servicio;

import com.fabervelez.AA07_EVIDENCIA01.modelo.Cliente;

public interface ServicioCliente {
    Cliente newCliente (Cliente newCliente);
    Iterable<Cliente> getAll();
    Cliente modifyCliente (Cliente cliente);
    Boolean deleteCliente (Long idcliente);
}
