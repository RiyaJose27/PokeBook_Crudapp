package com.codingdojo.poke.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.poke.models.Poke;
import com.codingdojo.poke.services.PokeService;



@Controller
public class HomeController {
	
	@Autowired
	PokeService pokeServ;

	
	
	//show all pokes
	@RequestMapping("/")
		public String index(Model model) {
		
		List<Poke> allPokes = pokeServ.allPokes();
		model.addAttribute("pokes", allPokes);
			return "index.jsp";
		}
	
	//Renders a form for creating a poke
	@RequestMapping("/newPoke")
	public String newPoke(@ModelAttribute("poke") Poke poke) {
		return "newPoke.jsp";
	}
	
	
	//This is the action from the form to actually make the poke
	 @RequestMapping(value="/createPoke", method=RequestMethod.POST)
	 
	 public String create(@Valid @ModelAttribute("poke") Poke poke, BindingResult result) {
		 
		 if(result.hasErrors()) {
			 return "newPoke.jsp";
		 }
		 pokeServ.create(poke); 
		 return "redirect:/";
	 }
	 
	 
	
	
	//render the jsp for the form to edit a poke
	@RequestMapping("/editPoke/{id}")
	public String editPoke(@PathVariable("id") long id, Model model) {
		Poke poke = pokeServ.onePoke(id);
		model.addAttribute("poke", poke);
		return "editPoke.jsp";
	}
	
	//this is the action form the form to actually edit the poke
	
	@RequestMapping(value="editPoke/{id}", method=RequestMethod.PUT)
	
	public String editingPoke(@Valid @ModelAttribute("poke") Poke poke, BindingResult result) {
        if (result.hasErrors()) {
            return "editPoke.jsp";
        } else {
            pokeServ.updatePoke(poke);
            return "redirect:/";
        }
    }
	
	

	
	//show one poke 
	@RequestMapping("/onePoke/{id}")
	public String onePoke(@PathVariable("id") Long id, Model model) {
		model.addAttribute("poke", pokeServ.onePoke(id));
		return "onePoke.jsp";
	}
	
	//delete one poke
	@RequestMapping("/destroy/{id}")
	public String destroy(@PathVariable("id") Long id) {
		pokeServ.destroy(id);
		return"redirect:/";
	}
	
	}


