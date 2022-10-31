
package com.AlexeiFF.Porfolio.repository;

import com.AlexeiFF.Porfolio.model.Usuario;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
      
        List<Usuario> findByUsername(String username);
        
}
