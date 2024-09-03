package br.edu.iftm.tspi.to_do_list.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ToDoList {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;

    @OneToMany
    private List<ToDoListItem> list;

    public ToDoList(){}

    public ToDoList(int id, String nome, List<ToDoListItem> list){
        this.id = id;
        this.nome = nome;
        list = new ArrayList<>();
    }
}
