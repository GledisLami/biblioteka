package com.biblioteka.biblioteka.repositories;

import com.biblioteka.biblioteka.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Optional<Author> findById(Integer id);

    Optional<Author> findByName(String name); //select * from author where name = ?


}
