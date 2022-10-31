
package com.AlexeiFF.Porfolio.repository;

import com.AlexeiFF.Porfolio.model.Persona;
import com.AlexeiFF.Porfolio.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long>{
    List<Persona> findByUsuarioLike(Usuario usuario);
}
