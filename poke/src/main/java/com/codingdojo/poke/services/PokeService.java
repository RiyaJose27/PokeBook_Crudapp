package com.codingdojo.poke.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.poke.models.Poke;
import com.codingdojo.poke.repositories.PokeRepository;


@Service
public class PokeService {

	
	 @Autowired
	 PokeRepository pokeRepo;
	 
	 
	 
	 //method to find all Poke
	 public List<Poke> allPokes(){
		 return pokeRepo.findAll();
	 }
	 
	 //method to create a Poke
	 
	 public Poke create(Poke poke) {
		 return pokeRepo.save(poke);
	 }
	 
	 //method to find one poke
	 public Poke onePoke(Long id) {
		 Optional <Poke> optionalPoke = pokeRepo.findById(id);
		 if(optionalPoke.isPresent())
		 {
			 return optionalPoke.get();
		 } else {
			 return null;
		 }
	 }
	 
	 //Method to update a poke
	  public Poke updatePoke(Poke poke) {
		  return pokeRepo.save(poke);
	  }
	 
	 //method to delete poke
	  public void destroy(Long id) {
		 pokeRepo.deleteById(id);
	  }
	 
}

