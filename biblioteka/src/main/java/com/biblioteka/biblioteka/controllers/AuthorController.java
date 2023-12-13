package com.biblioteka.biblioteka.controllers;

import com.biblioteka.biblioteka.entities.Author;
import com.biblioteka.biblioteka.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class AuthorController {

    //changing this inside Feature A, first commit
    @Autowired
    AuthorService authorService;

    @GetMapping("/{name}")
    public Optional<Author> findByName(String name){
        return authorService.findByName(name);
    }


    //lets add a method
    @GetMapping
    public String getHello(){
        return "hello World";
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

    @GetMapping
    public String featureBMethod(){
        return "This is part of feature B commit. Editing for the second time";
    }

    @GetMapping
    public String featureDMethod(){
        return "This is part of feature D commit. Editing for the final time";
    }

    @DeleteMapping
    public String mainMethodInterveningWithD(){
        return "I am a random update on the program. See if i will be fetched on your branch";
    }

}
