
package com.AlexeiFF.Porfolio.model;

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
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    private String nombre;
    private Integer porcentaje;
    private String tipoHabilidad;
    //@ManyToOne
   // @JoinColumn(name="id_tipo_habilidad")
    //private TipoHabilidad tipoHabilidad;
            
    //@ManyToOne
   // @JoinColumn(name="id_usuario")
   //private Usuario usuario;

    public Habilidad(Long id,String nombre, Integer porcentaje, String tipoHabilidad
            //,Usuario usuari
            ) {
       this.id=id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.tipoHabilidad = tipoHabilidad;
       // this.usuario = usuario;
    }

    public Habilidad() {
    }
    
    
}
