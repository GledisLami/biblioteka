package com.biblioteka.biblioteka.repositories;

import com.biblioteka.biblioteka.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
