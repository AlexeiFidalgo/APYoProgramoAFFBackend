
package com.AlexeiFF.Porfolio.repository;


import com.AlexeiFF.Porfolio.model.Habilidad;
import com.AlexeiFF.Porfolio.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HabilidadRepository extends JpaRepository<Habilidad,Long>{
    List<Habilidad> findByUsuarioLike(Usuario usuario);
}
