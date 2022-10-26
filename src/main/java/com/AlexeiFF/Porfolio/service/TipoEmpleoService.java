
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.TipoEmpleo;
import com.AlexeiFF.Porfolio.repository.TipoEmpleoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEmpleoService implements ITipoEmpleoService{
    
@Autowired
private TipoEmpleoRepository tipoEmpleoRepository;

    @Override
    public List<TipoEmpleo> verTipoEmpleo() {
        return tipoEmpleoRepository.findAll();
    }

    @Override
    public void crearTipoEmpleo(TipoEmpleo tipoEmpleo) {
        tipoEmpleoRepository.save(tipoEmpleo);
    }

    @Override
    public void borrarTipoEmpleo(Long id) {
        tipoEmpleoRepository.deleteById(id);
    }

    @Override
    public TipoEmpleo buscarTipoEmpleo(Long id) {
        return  tipoEmpleoRepository.findById(id).orElse(null);
    }    
}
