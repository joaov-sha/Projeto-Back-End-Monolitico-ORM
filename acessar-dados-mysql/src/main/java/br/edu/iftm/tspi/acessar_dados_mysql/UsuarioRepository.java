package br.edu.iftm.tspi.acessar_dados_mysql;

import org.springframework.data.repository.CrudRepository;
import br.edu.iftm.tspi.acessar_dados_mysql.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
    
}
