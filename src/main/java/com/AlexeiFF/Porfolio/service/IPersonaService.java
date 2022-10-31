
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.Persona;
import com.AlexeiFF.Porfolio.model.Usuario;
import java.util.List;


public interface IPersonaService {
     public List<Persona> verPersona();
    public void crearPersona(Persona persona);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    public List<Persona> buscarPersonaPorUsuario (Usuario usuario);
}
 