
package com.AlexeiFF.Porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
  @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String titulo;
    private String fotoPerfil;
    private String fotoBanner;
    private String descripcion;

    public Usuario(Long idUsuario, String nombre, String apellido, String titulo, String fotoPerfil, String fotoBanner, String descripcion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.fotoPerfil = fotoPerfil;
        this.fotoBanner = fotoBanner;
        this.descripcion = descripcion;
    }

    public Usuario() {
    }


}
