
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.TipoHabilidad;
import java.util.List;


public interface ITipoHabilidadService {
    public List<TipoHabilidad> verTipoHabilidad();
    public void crearTipoHabilidad(TipoHabilidad tipoHabilidad);
    public void borrarTipoHabilidad(Long id);
    public TipoHabilidad buscarTipoHabilidad (Long id);
}
