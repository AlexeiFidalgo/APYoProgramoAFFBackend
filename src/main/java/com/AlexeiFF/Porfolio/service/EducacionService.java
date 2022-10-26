
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.Educacion;
import com.AlexeiFF.Porfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{

@Autowired
private EducacionRepository educacionRepository;
    
    @Override
    public List<Educacion> verEducacion() {
        return  educacionRepository.findAll();
        }

    @Override
    public void crearEducacion(Educacion educacion) {
        educacionRepository.save(educacion);
                }

    @Override
    public void borrarEducacion(Long id) {
        educacionRepository.deleteById(id);    
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return  educacionRepository.findById(id).orElse(null);
        }

    
}
