
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.Proyecto;
import com.AlexeiFF.Porfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
@Autowired
private ProyectoRepository proyectoRepository;

    @Override
    public List<Proyecto> verProyecto() {
        return proyectoRepository.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return  proyectoRepository.findById(id).orElse(null);
    }
}
