package com.gavs.cities.citiescontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gavs.cities.city_entity.cityent;
import com.gavs.cities.cityservice.cityserv;


@RestController
@RequestMapping("/sample")
public class citycontrol {
	
	private cityserv tryserv1;
	
	@Autowired
	public citycontrol(cityserv tryserv1) {
		this.tryserv1 = tryserv1;
	}
	
	@PostMapping("/postdata")
	public cityent save(@RequestBody cityent cityent) {
		tryserv1.trysave(cityent);
		return cityent;
	}
	
	@GetMapping("/getdata")
	public List<cityent> view(){
		return tryserv1.viewdata();
	}
	
	@PutMapping("/updatedata")
	public cityent updateData(@RequestParam("id") int id, @RequestBody cityent cityent) {
		return tryserv1.updatedata(id, cityent);
	}
	
//	@DeleteMapping("/deletedata/{theid}")
//	public String deletebyid(@PathVariable int theid) {
//		
//	}
}
