package com.goonies.squad.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goonies.squad.domain.Categoria;
import com.goonies.squad.repositories.CategoriaRepository;
import com.goonies.squad.services.exceptions.ObjectNotFoundException;


@Service
public class CategoriaService {

	
	@Autowired
	private CategoriaRepository repo;
	
		

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	
	
	
	

}
