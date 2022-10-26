
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.TipoEducacion;
import com.AlexeiFF.Porfolio.repository.TipoEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEducacionService implements  ITipoEducacionService{
    
@Autowired
private TipoEducacionRepository tipoEducacionRepository;

    @Override
    public List<TipoEducacion> verTipoEducacion() {
        return tipoEducacionRepository.findAll();
    }

    @Override
    public void crearTipoEducacion(TipoEducacion tipoEducacion) {
        tipoEducacionRepository.save(tipoEducacion);
    }

    @Override
    public void borrarTipoEducacion(Long id) {
        tipoEducacionRepository.deleteById(id);
    }

    @Override
    public TipoEducacion buscarTipoEducacion(Long id) {
        return  tipoEducacionRepository.findById(id).orElse(null);
    }    
}
