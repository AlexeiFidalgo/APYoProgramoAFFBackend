
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.Persona;
import com.AlexeiFF.Porfolio.model.Usuario;
import com.AlexeiFF.Porfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
@Autowired
private PersonaRepository personaRepository;

    @Override
    public List<Persona> verPersona() {
        return  personaRepository.findAll();
        }

    @Override
    public void crearPersona(Persona educacion) {
        personaRepository.save(educacion);
                }

    @Override
    public void borrarPersona(Long id) {
        personaRepository.deleteById(id);    
    }

    @Override
    public Persona buscarPersona(Long id) {
        return  personaRepository.findById(id).orElse(null);
        }


    
}
