
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.Habilidad;
import com.AlexeiFF.Porfolio.model.Usuario;
import java.util.List;


public interface IHabilidadService {
    public List<Habilidad> verHabilidad();
    public void crearHabilidad(Habilidad habilidad);
    public void borrarHabilidad(Long id);
    public Habilidad buscarHabilidad (Long id);
    public List<Habilidad> buscarHabilidadPorUsuario (Usuario usuario);
}
