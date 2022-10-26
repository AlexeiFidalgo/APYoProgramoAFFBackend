
package com.AlexeiFF.Porfolio.controller;

import com.AlexeiFF.Porfolio.model.Usuario;
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


@RequestMapping("usuario")
@RestController
public class UsuarioController {

@Autowired
private IUsuarioService usuarioService;
 
 
@PostMapping("/nuevo")
public void crearUsuario(@RequestBody Usuario usuario) {
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


    
}
