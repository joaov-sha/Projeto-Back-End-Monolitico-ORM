package br.edu.iftm.tspi.acessar_dados_jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    List<Cliente> findBySobreNome(String sobreNome);

    Cliente findById(long id);
}
