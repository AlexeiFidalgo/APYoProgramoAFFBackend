
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.ExperienciaLaboral;
import com.AlexeiFF.Porfolio.model.Usuario;
import com.AlexeiFF.Porfolio.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService{
       
@Autowired
private ExperienciaLaboralRepository experienciaLaboralRepository;

    @Override
    public List<ExperienciaLaboral> verExperienciaLaboral() {
        return experienciaLaboralRepository.findAll();
    }

    @Override
    public void crearExperienciaLaboral(ExperienciaLaboral experienciaLaboral) {
        experienciaLaboralRepository.save(experienciaLaboral);
    }

    @Override
    public void borrarExperienciaLaboral(Long id) {
        experienciaLaboralRepository.deleteById(id);
    }

    @Override
    public ExperienciaLaboral buscarExperienciaLaboral(Long id) {
        return  experienciaLaboralRepository.findById(id).orElse(null);
    }

   
    
}
