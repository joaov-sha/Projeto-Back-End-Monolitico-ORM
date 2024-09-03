package br.edu.iftm.tspi.to_do_list.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class ToDoListItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;

    @ManyToOne
    private ToDoList toDoList;

    public ToDoListItem(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
}
