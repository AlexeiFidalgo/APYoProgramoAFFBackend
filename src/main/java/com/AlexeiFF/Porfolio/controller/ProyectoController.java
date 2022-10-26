
package com.AlexeiFF.Porfolio.controller;

import com.AlexeiFF.Porfolio.model.Proyecto;
import com.AlexeiFF.Porfolio.service.IProyectoService;
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

@RequestMapping("proyecto")
@RestController
public class ProyectoController {
   
@Autowired
private IProyectoService proyectoService;
 
 
@PostMapping("/nuevo")
public void crearProyecto(@RequestBody Proyecto proyecto) {
       proyectoService.crearProyecto(proyecto);
       }
 
@GetMapping("/verTodo")
@ResponseBody
public List<Proyecto> verProyecto() {
       return  proyectoService.verProyecto();
       } 

@DeleteMapping("/borrar/{id}")
public void borrarProyecto(@PathVariable Long id) {
       proyectoService.borrarProyecto(id);
       }  

@GetMapping("/verPorId/{id}")
public Proyecto buscarProyecto(@PathVariable Long id) {
       return  proyectoService.buscarProyecto(id);
        }       
    
    
}
