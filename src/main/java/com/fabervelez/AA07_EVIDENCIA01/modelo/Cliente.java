package com.fabervelez.AA07_EVIDENCIA01.modelo;

//clase paraa crear la entidad de la aplicacion

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Cliente {
    @Id
    @Column (name= "idcliente")
    private Long idcliente;
    @Column (name = "nombres",nullable= false, length = 25)
    private String nombre;
    @Column (name = "apellidos",nullable = false, length= 100)
    private String apellido;
    @Column (name="email",unique =true, nullable = false)
    private String emal;
}
