package com.crud.crudbook.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Videogame")
@Table(name = "videogame")
@Data
public class Videogame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String genre;

    private Integer numberHours;
}
