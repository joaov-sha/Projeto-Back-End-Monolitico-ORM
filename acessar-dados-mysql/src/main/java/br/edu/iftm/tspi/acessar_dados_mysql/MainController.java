package br.edu.iftm.tspi.acessar_dados_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//S6833 - Remover anotações Controller e substituí-las por anotações @RestController e remover todas as anotações ResponseBody
@RestController
@RequestMapping(path="/demo")
public class MainController {
    //S6813 - Remover injeção de por campos e adicionar injeção por construtor
    private UsuarioRepository usuarioRepository;

    public UsuarioRepository getUsuarioRepository() {
        return usuarioRepository;
    }

    public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping("/add")
    public @ResponseBody String addNewUser (@RequestParam String nome, @RequestParam String email){

        Usuario n = new Usuario();
        n.setNome(nome);
        n.setEmail(email);
        usuarioRepository.save(n);

        return "Salvo";
    }
    
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Usuario> getAllUsers(){
        return usuarioRepository.findAll();
    }
    
}


