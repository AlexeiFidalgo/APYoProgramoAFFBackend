
package com.AlexeiFF.Porfolio.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEducacion;
    private String titulo;
    private String nombreInstitucion;
    private String logo;
    private Date fechaInicio;
    private Date fechaFin;
    
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name="id_tipo_educacion")
    private TipoEducacion tipoEducacion;

    public Educacion(Long idEducacion, String titulo, String nombreInstitucion) {
        this.idEducacion = idEducacion;
        this.titulo = titulo;
        this.nombreInstitucion = nombreInstitucion;
    }

    public Educacion() {
    }
    
    
    
    
    
    
}
