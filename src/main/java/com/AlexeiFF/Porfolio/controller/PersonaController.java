
package com.AlexeiFF.Porfolio.controller;

import com.AlexeiFF.Porfolio.model.Persona;
import com.AlexeiFF.Porfolio.model.Usuario;
import com.AlexeiFF.Porfolio.service.IPersonaService;
import com.AlexeiFF.Porfolio.service.IUsuarioService;
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


    @RequestMapping("persona")
@RestController
public class PersonaController {
  
@Autowired
private IPersonaService personaService;
 
@Autowired
private IUsuarioService usuarioService;
 
@PostMapping("/nuevo")
public void crearPersona(@RequestBody Persona persona) {
       personaService.crearPersona(persona);
       }
@PostMapping("/modificar/{id}")
public void modificarPersona(@PathVariable Long id,@RequestBody Persona persona ) {
       personaService.crearPersona(persona);
       }
 
@GetMapping("/verTodo")
@ResponseBody
public List<Persona> verPersona() {
       return  personaService.verPersona();
       } 

@DeleteMapping("/borrar/{id}")
public void borrarHabilidad(@PathVariable Long id) {
       personaService.borrarPersona(id);
       }  

@GetMapping("/verPorId/{id}")
public Persona buscarPersona(@PathVariable Long id) {
       return  personaService.buscarPersona(id);
        }   
    @GetMapping("/verPorIdUsuario/{id}")
public  List buscarPersonaPorUsuario(@PathVariable Long id) {
    Usuario user = usuarioService.buscarUsuario(id);
       return  personaService.buscarPersonaPorUsuario(user);
        }  
    
    }
