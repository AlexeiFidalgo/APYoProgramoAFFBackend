
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.Educacion;
import com.AlexeiFF.Porfolio.model.Usuario;
import java.util.List;




public interface IEducacionService {
    public List<Educacion> verEducacion();
    public void crearEducacion(Educacion educacion);
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion (Long id);
    public List<Educacion> buscarEducacionPorUsuario (Usuario usuario);
}
