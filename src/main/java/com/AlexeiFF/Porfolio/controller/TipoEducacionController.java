
package com.AlexeiFF.Porfolio.controller;

import com.AlexeiFF.Porfolio.model.TipoEducacion;
import com.AlexeiFF.Porfolio.service.ITipoEducacionService;
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

@RequestMapping("tipoEducacion")
@RestController
public class TipoEducacionController {
    
@Autowired
private ITipoEducacionService tipoEducacionService; 


@PostMapping("/nuevo")
public void crearTipoEducacion( @RequestBody TipoEducacion tipoEducacion) {
       tipoEducacionService.crearTipoEducacion(tipoEducacion);
       }
 
@GetMapping("/verTodo")
@ResponseBody
public List<TipoEducacion> verTipoEducacion() {
       return tipoEducacionService.verTipoEducacion();

       } 

@DeleteMapping("/borrar/{id}")
public void borrarTipoEducacion(@PathVariable Long id) {
       tipoEducacionService.borrarTipoEducacion(id);
       }  

@GetMapping("/verPorId/{id}")
public TipoEducacion buscarTipoEducacion(@PathVariable Long id) {
       return  tipoEducacionService.buscarTipoEducacion(id);
        }


}
