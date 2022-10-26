
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.TipoEmpleo;
import java.util.List;

public interface ITipoEmpleoService {
    public List<TipoEmpleo> verTipoEmpleo();
    public void crearTipoEmpleo(TipoEmpleo tipoEmpleo);
    public void borrarTipoEmpleo(Long id);
    public TipoEmpleo buscarTipoEmpleo (Long id); 
}
