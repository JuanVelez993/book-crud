package com.crud.crudbook.service;

import com.crud.crudbook.entity.Videogame;
import com.crud.crudbook.repository.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideogameService implements VideogameServiceInterface{

    @Autowired
    private VideogameRepository videogameRepository;

    @Override
    public List<Videogame> getAllVideogames() {
        return videogameRepository.findAll();
    }

    @Override
    public Videogame saveVideogame(Videogame videogame) {
        return videogameRepository.save(videogame);
    }

    @Override
    public Videogame updateVideogame(Videogame videogame) {
        return videogameRepository.save(videogame);
    }

    @Override
    public void deleteVideogame(Long id) {
        videogameRepository.deleteById(id);
    }
}
