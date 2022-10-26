


package com.AlexeiFF.Porfolio.model;

import java.util.Date;
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
public class ExperienciaLaboral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExperienciaLaboral;
    private String nombre; 
    private String titulo;
    private String logo;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;

    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name="id_tipo_empleo")
    private TipoEmpleo tipoEmpleo;

    public ExperienciaLaboral(Long idExperienciaLaboral, String nombre, String titulo, String logo, String descripcion, Date fechaInicio, Date fechaFin, Usuario usuario, TipoEmpleo tipoEmpleo) {
        this.idExperienciaLaboral = idExperienciaLaboral;
        this.nombre = nombre;
        this.titulo = titulo;
        this.logo = logo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.usuario = usuario;
        this.tipoEmpleo = tipoEmpleo;
    }

    public ExperienciaLaboral() {
    }
    
    
    
}
