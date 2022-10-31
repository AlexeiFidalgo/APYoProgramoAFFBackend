
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.Proyecto;
import com.AlexeiFF.Porfolio.model.Usuario;
import java.util.List;

public interface IProyectoService {
     public List<Proyecto> verProyecto();
    public void crearProyecto(Proyecto proyecto);
    public void borrarProyecto(Long id);
    public Proyecto buscarProyecto (Long id);
    public List<Proyecto> buscarProyectoPorUsuario (Usuario usuario);
}
