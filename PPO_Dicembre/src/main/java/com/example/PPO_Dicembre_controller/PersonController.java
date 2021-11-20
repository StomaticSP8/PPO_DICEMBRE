package com.example.PPO_Dicembre_controller;

import java.util.Vector;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.PPO_Dicembre_model.citta;

@RestController

public class PersonController {
	public citta v =new citta("perano","1200");
	@GetMapping("/ciao")
	public String exampleMethod(@RequestParam(name="param1", defaultValue="none") String param1) {
		return v.getNome();
				
				
			//List<citta> list= new ArrayList<citta>();
			
			
			//public citta citta1 =new citta("Roma","1200000");
			//public citta citta2 = new citta("Atessa","12342");
			//list.add("citta1");
	
	
		
		//@GetMapping("/persone")
		//public citta exampleMethod(@RequestParam(name="param2", defaultValue="none")String param2) {
			//return new citta ("parigi","39475828");
		}
		
	

}

