package com.crud.crudbook.controller;

import com.crud.crudbook.entity.Videogame;
import com.crud.crudbook.service.VideogameServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class VideogameController {
    @Autowired
    private VideogameServiceInterface service;

    @GetMapping("get/videogames")
    public List<Videogame> getAllVideogames(){
        return service.getAllVideogames();
    }

    @PostMapping("save/videogame")
    public Videogame saveVideogame(@RequestBody Videogame videogame){
        return service.saveVideogame(videogame);
    }

    @PutMapping("update/videogame")
    public Videogame updateVideogame(@RequestBody Videogame videogame){
        return service.updateVideogame(videogame);
    }

    @DeleteMapping("delete/videogame/{id}")
    public void deleteVideogame(@PathVariable Long id){
        service.deleteVideogame(id);
    }
}
