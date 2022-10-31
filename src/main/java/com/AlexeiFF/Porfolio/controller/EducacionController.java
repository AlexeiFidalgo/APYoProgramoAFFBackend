
package com.AlexeiFF.Porfolio.controller;

import com.AlexeiFF.Porfolio.model.Educacion;
import com.AlexeiFF.Porfolio.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("educacion")
@RestController
public class EducacionController {
    
@Autowired
private IEducacionService educacionService;
 
 
@PostMapping("/nuevo")
public void crearEducacion(@RequestBody Educacion educacion) {
       educacionService.crearEducacion(educacion);
       }
@PutMapping("/modificar/{id}")
public void modificarEducacion(@PathVariable Long id,@RequestBody Educacion educacion) {
    educacion.setId(id);
    educacionService.crearEducacion(educacion);
       }
 
@GetMapping("/verTodo")
@ResponseBody
public List<Educacion> verEducacion() {
       return  educacionService.verEducacion();
       } 

@DeleteMapping("/borrar/{id}")
public void borrarEducacion(@PathVariable Long id) {
       educacionService.borrarEducacion(id);
       }  

@GetMapping("/verPorId/{id}")
public Educacion buscarEducacion(@PathVariable Long id) {
       return  educacionService.buscarEducacion(id);
        }   


}
