
package com.AlexeiFF.Porfolio.controller;

import com.AlexeiFF.Porfolio.model.TipoHabilidad;
import com.AlexeiFF.Porfolio.service.ITipoHabilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("tipoHabilidad")
@RestController
public class TipoHabilidadController {

@Autowired
private ITipoHabilidadService tipoHabilidadService;
 
 
@PostMapping("/nuevo")
public void crearTipoHabilidad(@RequestBody TipoHabilidad tipoHabilidad) {
       tipoHabilidadService.crearTipoHabilidad(tipoHabilidad);
       }
 
@GetMapping("/verTodo")
@ResponseBody
public List<TipoHabilidad> verTipoHabilidad() {
       return  tipoHabilidadService.verTipoHabilidad();
       } 

@DeleteMapping("/borrar/{id}")
public void borrarTipoHabilidad(@PathVariable Long id) {
       tipoHabilidadService.borrarTipoHabilidad(id);
       }  

@GetMapping("/verPorId/{id}")
public TipoHabilidad buscarTipoHabilidad(@PathVariable Long id) {
       return  tipoHabilidadService.buscarTipoHabilidad(id);
        }    
}
