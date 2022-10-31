
package com.AlexeiFF.Porfolio.service;

import com.AlexeiFF.Porfolio.model.Usuario;
import com.AlexeiFF.Porfolio.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{

@Autowired
private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> verUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void borrarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        return  usuarioRepository.findById(id).orElse(null);
        
    }

    @Override
    public List<Usuario> buscarUsuarioPorUsername(String username) {
       return usuarioRepository.findByUsername(username);
    }

   
    
    
}
