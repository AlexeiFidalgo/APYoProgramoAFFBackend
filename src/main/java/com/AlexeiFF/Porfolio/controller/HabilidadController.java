
package com.AlexeiFF.Porfolio.controller;

import com.AlexeiFF.Porfolio.model.Habilidad;
import com.AlexeiFF.Porfolio.service.IHabilidadService;
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

@RequestMapping("habilidad")
@RestController
public class HabilidadController {
  
@Autowired
private IHabilidadService habilidadService;
 
 
@PostMapping("/nuevo")
public void crearHabilidad(@RequestBody Habilidad habilidad) {
       habilidadService.crearHabilidad(habilidad);
       }
 
@GetMapping("/verTodo")
@ResponseBody
public List<Habilidad> verHabilidad() {
       return  habilidadService.verHabilidad();
       } 

@DeleteMapping("/borrar/{id}")
public void borrarHabilidad(@PathVariable Long id) {
       habilidadService.borrarHabilidad(id);
       }  

@GetMapping("/verPorId/{id}")
public Habilidad buscarHabilidad(@PathVariable Long id) {
       return  habilidadService.buscarHabilidad(id);
        }   
    
    
}
