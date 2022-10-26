
package com.AlexeiFF.Porfolio.controller;

import com.AlexeiFF.Porfolio.model.TipoEmpleo;
import com.AlexeiFF.Porfolio.service.ITipoEmpleoService;
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

@RequestMapping("tipoEmpleo")
@RestController
public class TipoEmpleoController {

 @Autowired
private ITipoEmpleoService tipoEmpleoService;   
    
    
@PostMapping("/nuevo")
public void crearTipoEmpleo(@RequestBody TipoEmpleo tipoEmpleo) {
       tipoEmpleoService.crearTipoEmpleo(tipoEmpleo);
       }
 
@GetMapping("/verTodo")
@ResponseBody
public List<TipoEmpleo> verTipoEmpleo() {
       return  tipoEmpleoService.verTipoEmpleo();
       } 

@DeleteMapping("/borrar/{id}")
public void borrarTipoEmpleo(@PathVariable Long id) {
       tipoEmpleoService.borrarTipoEmpleo(id);
       }  

@GetMapping("/verPorId/{id}")
public TipoEmpleo buscarTipoEmpleo(@PathVariable Long id) {
       return  tipoEmpleoService.buscarTipoEmpleo(id);
        }
}
