
package com.AlexeiFF.Porfolio.model;

//import java.util.Date;
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
public class Proyecto {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String descripcion;
    private String urlProyecto;
    private Integer anoFin;
    
    //@ManyToOne
    //@JoinColumn(name="id_usuario")
    //private Usuario usuario;

    public Proyecto(Long id, String nombre, String descripcion, String urlProyecto, Integer anoFin
            //,Usuario usuario
    ) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlProyecto = urlProyecto;
        this.anoFin = anoFin;
        //this.usuario = usuario;
    }

    public Proyecto() {
    }
    
    
    
    

   
    

}
