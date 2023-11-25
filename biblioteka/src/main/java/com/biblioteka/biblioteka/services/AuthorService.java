package com.biblioteka.biblioteka.services;

import com.biblioteka.biblioteka.entities.Author;
import com.biblioteka.biblioteka.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public Optional<Author> findByName(String name){
        return authorRepository.findByName(name);
    }

    public Optional<Author> findById(Integer id){
        return authorRepository.findById(id);
    }

    public void saveAuthor(String name){
        Author author = new Author();
        author.setName(name);
        authorRepository.save(author);
    }

    public void updateStudentet(Integer kursi){

    }

    @Transactional
    public void updateAuthor(Integer id, String name){
        Optional<Author> author = authorRepository.findById(id);

        author.get().setName(name);
    }

    public void deleteAuthor(Integer id){
        Optional<Author> author = authorRepository.findById(id);

        Author author1 = new Author();
        author1.setId(author.get().getId());
        author1.setName(author.get().getName());

        authorRepository.delete(author1);
    }

}
