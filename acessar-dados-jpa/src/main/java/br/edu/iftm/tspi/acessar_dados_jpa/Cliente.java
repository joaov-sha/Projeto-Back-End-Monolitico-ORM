package br.edu.iftm.tspi.acessar_dados_jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
//S1128 Remoção de imports não utilizados em projeto
import jakarta.persistence.Id;

@Entity
public class Cliente {
    
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String sobreNome;

    protected Cliente(){}

    public Cliente(String nome, String sobreNome){
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    @Override
    public String toString(){
        return String.format("Cliente[id=%d, nome='%s', sobreNome='%s']",id,nome,sobreNome);
    }

    public Long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getSobreNome(){
        return sobreNome;
    }
}
