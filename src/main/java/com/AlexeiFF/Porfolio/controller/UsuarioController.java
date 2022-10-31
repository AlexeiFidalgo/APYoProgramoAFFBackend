
package com.AlexeiFF.Porfolio.controller;

import com.AlexeiFF.Porfolio.model.Persona;
import com.AlexeiFF.Porfolio.model.Usuario;
import com.AlexeiFF.Porfolio.service.IEducacionService;
import com.AlexeiFF.Porfolio.service.IExperienciaLaboralService;
import com.AlexeiFF.Porfolio.service.IHabilidadService;
import com.AlexeiFF.Porfolio.service.IPersonaService;
import com.AlexeiFF.Porfolio.service.IProyectoService;
import com.AlexeiFF.Porfolio.service.IUsuarioService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("usuario")
@RestController
public class UsuarioController {

@Autowired
private IUsuarioService usuarioService;
@Autowired
private IExperienciaLaboralService experienciaLaboralService;
@Autowired
private IHabilidadService habilidadService;
@Autowired
private IEducacionService educacionService;
@Autowired
private IPersonaService personaService;
@Autowired
private IProyectoService IProyectoService;


@PostMapping("/nuevo")
public void crearUsuario(@RequestBody Usuario usuario) {
       usuarioService.crearUsuario(usuario);
       }
@PostMapping("/modificar/{id}")
public void modificar(@PathVariable Long id,@RequestBody  Usuario usuario) {
       usuarioService.crearUsuario(usuario);
       }
 
@GetMapping("/verTodo")
@ResponseBody
public List<Usuario> verUsuario() {
       return  usuarioService.verUsuario();
       } 

@DeleteMapping("/borrar/{id}")
public void borrarUsuario(@PathVariable Long id) {
       usuarioService.borrarUsuario(id);
       }  

@GetMapping("/verPorId/{id}")
public Usuario buscarUsuario(@PathVariable Long id) {
        return  usuarioService.buscarUsuario(id);
        }

@GetMapping("/verPorUsername/{username}")
public List<Usuario> buscarUsuario(@PathVariable String username) {
        return  usuarioService.buscarUsuarioPorUsername(username);
        }

@GetMapping("/verTodoCV")
    public Map<String, List> buscarTodoPorUsuario() {
    Map<String, List> dataMap = new HashMap<>();
    
    List<Persona> personas =  new ArrayList<>();
    personas  = personaService.verPersona();
    dataMap.put("persona", personas);
    dataMap.put("experiencia",experienciaLaboralService.verExperienciaLaboral() );
    dataMap.put("educacion", educacionService.verEducacion());
    dataMap.put("habilidad", habilidadService.verHabilidad());
    dataMap.put("proyecto",personaService.verPersona());
        return  dataMap;
        }


@PostMapping("/iniciarSesion")
public ResponseEntity<?> iniciarSesion(@RequestBody Usuario usuarioForm){
    List<Usuario> usuarios=usuarioService.buscarUsuarioPorUsername(usuarioForm.getUsername());
     if(usuarios.get(0).getPassword().equals(usuarioForm.getPassword()) ){
         
         return ResponseEntity.ok(usuarios.get(0));
}
    return(ResponseEntity<?>)ResponseEntity.internalServerError();

}
   



    
}
