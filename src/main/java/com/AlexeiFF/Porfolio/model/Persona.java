
package com.AlexeiFF.Porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long idPersona;
    private String nombre;
    private String apellido;
    private String titulo;
    private String fotoPerfil;
    private String fotoBanner;
    private String descripcion;
    
    @OneToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
    
    
    
    
    
}
