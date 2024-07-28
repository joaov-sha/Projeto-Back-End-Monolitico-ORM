package br.edu.iftm.tspi.to_do_list.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/todolist")
public class ToDoListController {
    
    @GetMapping("/listar")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
