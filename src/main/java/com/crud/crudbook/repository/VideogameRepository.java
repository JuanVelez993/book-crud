package com.crud.crudbook.repository;

import com.crud.crudbook.entity.Book;
import com.crud.crudbook.entity.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideogameRepository extends JpaRepository<Videogame, Long> {
}
