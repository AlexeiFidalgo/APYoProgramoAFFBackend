
package com.AlexeiFF.Porfolio.service;


import com.AlexeiFF.Porfolio.model.ExperienciaLaboral;
import com.AlexeiFF.Porfolio.model.Usuario;
import java.util.List;


public interface IExperienciaLaboralService {
    public List<ExperienciaLaboral> verExperienciaLaboral();
    public void crearExperienciaLaboral(ExperienciaLaboral experienciaLaboral);
    public void borrarExperienciaLaboral(Long id);
    public ExperienciaLaboral buscarExperienciaLaboral (Long id);
    public List<ExperienciaLaboral> buscarExperienciaLaboralPorUsuario (Usuario usuario);
}