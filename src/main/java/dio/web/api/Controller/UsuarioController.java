package dio.web.api.Controller;


import dio.web.api.Model.Usuario;
import dio.web.api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UserRepository repositorio;

    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return repositorio.findAll();
    }

    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repositorio.findByUsername(username);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Integer id){
        repositorio.deleteById(id);
    }

    @PostMapping("users")
    public void postUser(Usuario usuario){
        repositorio.save(usuario);
    }

    @PutMapping()
    public void putUser(@RequestBody Usuario usuario){
        repositorio.save(usuario);
    }

















}
