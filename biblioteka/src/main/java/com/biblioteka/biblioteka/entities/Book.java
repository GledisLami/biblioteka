package com.biblioteka.biblioteka.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)   //   1    2    3
    private Integer id;

    @Column
    private String name;

    @Column
    private String author;
}
