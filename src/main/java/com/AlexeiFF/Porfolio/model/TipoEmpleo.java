
package com.AlexeiFF.Porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class TipoEmpleo {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTipoEmpleo;
    private String nombre;

    public TipoEmpleo(Long idTipoEmpleo, String nombre) {
        this.idTipoEmpleo = idTipoEmpleo;
        this.nombre = nombre;
    }

    public TipoEmpleo() {
    }
    
    
}
