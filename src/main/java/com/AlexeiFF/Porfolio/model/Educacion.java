
package com.AlexeiFF.Porfolio.model;

//import java.util.Date;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String nombreInstitucion;
    private String logo;
    private Integer anoInicio;
    private Integer anoFin;
    private String tipoEducacion;
    //@ManyToOne
    //@JoinColumn(name="id_usuario")
    //private Usuario usuario;
    
    //@ManyToOne
    //@JoinColumn(name="id_tipo_educacion")
    //private TipoEducacion tipoEducacion;

    public Educacion(
            Long id, String titulo, String nombreInstitucion, String logo, Integer anoInicio, Integer anoFin,String tipoEducacion
            //,Usuario usuario, TipoEducacion tipoEducacion
    ) {
        this.id = id;
        this.titulo = titulo;
        this.nombreInstitucion = nombreInstitucion;
        this.logo = logo;
        this.anoInicio = anoInicio;
        this.anoFin = anoFin;
        //this.usuario = usuario;
        this.tipoEducacion = tipoEducacion;
    }



    public Educacion() {
    }
    
    
    
    
    
    
}
