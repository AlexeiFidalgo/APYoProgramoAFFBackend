
package com.AlexeiFF.Porfolio.controller;

import com.AlexeiFF.Porfolio.model.ExperienciaLaboral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.AlexeiFF.Porfolio.service.IExperienciaLaboralService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("experienciaLaboral")
@RestController
public class ExperienciaLaboralController {
    
@Autowired
private IExperienciaLaboralService experienciaLaboralService;
 
 
@PostMapping("/nuevo")
public void crearExperienciaLaboral(@RequestBody ExperienciaLaboral experienciaLaboral) {
       experienciaLaboralService.crearExperienciaLaboral(experienciaLaboral);
       }
 
@GetMapping("/verTodo")
@ResponseBody
public List<ExperienciaLaboral> verExperienciaLaboral() {
       return  experienciaLaboralService.verExperienciaLaboral();
       } 

@DeleteMapping("/borrar/{id}")
public void borrarExperienciaLabora(@PathVariable Long id) {
       experienciaLaboralService.borrarExperienciaLaboral(id);
       }   
@GetMapping("/verPorId/{id}")
public ExperienciaLaboral buscarExperienciaLabora(@PathVariable Long id) {
       return  experienciaLaboralService.buscarExperienciaLaboral(id);
        }   
}