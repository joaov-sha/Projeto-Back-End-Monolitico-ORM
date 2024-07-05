package br.edu.iftm.tspi.acessar_dados_mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private UsuarioRepository usuarioRepository;

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


