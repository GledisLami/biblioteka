package com.biblioteka.biblioteka.controllers;

import com.biblioteka.biblioteka.entities.Author;
import com.biblioteka.biblioteka.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping("/{name}")
    public Optional<Author> findByName(String name){
        return authorService.findByName(name);
    }

    @GetMapping("/id")
    public Optional<Author> findById(@RequestParam Integer id){
        return authorService.findById(id);
    }

    @PostMapping
    public void saveAuthor(@RequestParam String name){
        authorService.saveAuthor(name);
    }

    @PutMapping
    public void updateAuthor(@RequestParam Integer id, @RequestParam String name){
        authorService.updateAuthor(id, name);
    }

    @DeleteMapping
    public void deleteAuthor(@RequestParam Integer id){
        authorService.deleteAuthor(id);
    }

}
