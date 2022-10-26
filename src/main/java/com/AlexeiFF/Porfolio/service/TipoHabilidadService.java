
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.TipoHabilidad;
import com.AlexeiFF.Porfolio.repository.TipoHabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoHabilidadService implements ITipoHabilidadService{

@Autowired
private TipoHabilidadRepository tipoHabilidadRepository;

    @Override
    public List<TipoHabilidad> verTipoHabilidad() {
        return tipoHabilidadRepository.findAll();
    }

    @Override
    public void crearTipoHabilidad(TipoHabilidad tipoHabilidad) {
        tipoHabilidadRepository.save(tipoHabilidad);
    }

    @Override
    public void borrarTipoHabilidad(Long id) {
        tipoHabilidadRepository.deleteById(id);
    }

    @Override
    public TipoHabilidad buscarTipoHabilidad(Long id) {
        return  tipoHabilidadRepository.findById(id).orElse(null);
    }    
}
