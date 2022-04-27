package com.crud.crudbook.service;

import com.crud.crudbook.entity.Videogame;

import java.util.List;

public interface VideogameServiceInterface {
    List<Videogame> getAllVideogames();

    Videogame saveVideogame(Videogame videogame);

    Videogame updateVideogame(Videogame videogame);

    void deleteVideogame(Long id);
}
