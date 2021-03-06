package com.codingdojo.poke.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.poke.models.Poke;


@Repository

public interface PokeRepository extends CrudRepository<Poke, Long> {

	List<Poke> findAll();
	
	
	
}
