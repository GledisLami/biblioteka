package com.biblioteka.biblioteka.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "author")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;
}
