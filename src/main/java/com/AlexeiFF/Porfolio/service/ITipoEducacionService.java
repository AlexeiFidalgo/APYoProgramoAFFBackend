
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.TipoEducacion;
import java.util.List;


public interface ITipoEducacionService {
    public List<TipoEducacion> verTipoEducacion();
    public void crearTipoEducacion(TipoEducacion tipoEducacion);
    public void borrarTipoEducacion(Long id);
    public TipoEducacion buscarTipoEducacion (Long id);  
}
