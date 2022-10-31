
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.Habilidad;
import com.AlexeiFF.Porfolio.model.Usuario;
import com.AlexeiFF.Porfolio.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {
   
@Autowired
private HabilidadRepository habilidadRepository;

    @Override
    public List<Habilidad> verHabilidad() {
        return habilidadRepository.findAll();
    }

    @Override
    public void crearHabilidad(Habilidad habilidad) {
        habilidadRepository.save(habilidad);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habilidadRepository.deleteById(id);
    }

    @Override
    public Habilidad buscarHabilidad(Long id) {
        return  habilidadRepository.findById(id).orElse(null);
    }

    @Override
    public List<Habilidad> buscarHabilidadPorUsuario(Usuario usuario) {
      return  habilidadRepository.findByUsuarioLike(usuario);
    }
}
