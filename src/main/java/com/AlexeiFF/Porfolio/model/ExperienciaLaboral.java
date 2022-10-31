


package com.AlexeiFF.Porfolio.model;

//import java.util.Date;
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
public class ExperienciaLaboral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre; 
    private String puesto;
    private String logo;
    private String descripcion;
    private Integer anoInicio;
    private Integer anoFin;
    private String tipoEmpleo;
    //@ManyToOne
    //@JoinColumn(name="id_usuario")
   // private Usuario usuario;
    
    //@ManyToOne
    //@JoinColumn(name="id_tipo_empleo")
    //private TipoEmpleo tipoEmpleo;

    public ExperienciaLaboral(Long id, String nombre, String puesto, 
            String logo, String descripcion, Integer anoInicio, Integer anoFin, String tipoEmpleo
            //,Usuario usuario,TipoEmpleo tipoEmpleo
        ) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.logo = logo;
        this.descripcion = descripcion;
        this.anoInicio = anoInicio;
        this.anoFin = anoFin;
        this.tipoEmpleo=tipoEmpleo;
        //this.usuario = usuario;
        //this.tipoEmpleo = tipoEmpleo;
    }

    public ExperienciaLaboral() {
    }
    
    
    
}
