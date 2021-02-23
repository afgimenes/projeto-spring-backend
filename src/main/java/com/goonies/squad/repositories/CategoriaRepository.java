package com.goonies.squad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goonies.squad.domain.Categoria;



@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
