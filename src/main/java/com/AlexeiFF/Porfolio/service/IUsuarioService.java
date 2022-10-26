
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.Usuario;
import java.util.List;


public interface IUsuarioService {
    public List<Usuario> verUsuario();
    public void crearUsuario(Usuario usuario);
    public void borrarUsuario(Long id);
    public Usuario buscarUsuario (Long id);
}
