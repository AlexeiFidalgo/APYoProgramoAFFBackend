
package com.AlexeiFF.Porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
    
     private String nombre;
    private String apellido;
    private String titulo;
    private String fotoPerfil;
    private String fotoBanner;
    private String descripcion;
    
    //@OneToOne
    //@JoinColumn(name="id_usuario")
    //private Usuario usuario;

    public Persona(Long id, String nombre, String apellido, String titulo, String fotoPerfil, String fotoBanner, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.fotoPerfil = fotoPerfil;
        this.fotoBanner = fotoBanner;
        this.descripcion = descripcion;
    }

    public Persona() {
    }
    
    
    
    
    
}
