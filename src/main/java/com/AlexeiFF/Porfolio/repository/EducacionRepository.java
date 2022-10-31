
package com.AlexeiFF.Porfolio.repository;

import com.AlexeiFF.Porfolio.model.Educacion;

import com.AlexeiFF.Porfolio.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Long>{
    List<Educacion> findByUsuarioLike(Usuario usuario);
}
