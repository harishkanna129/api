package com.gavs.cities.cityservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gavs.cities.city_entity.cityent;
import com.gavs.cities.cityrepo.tryrepointer;

@Service
public class cityserv {
	
	private tryrepointer tryrepo;

	@Autowired
	public cityserv(tryrepointer tryrepo) {
		this.tryrepo = tryrepo;
	}
	
	public void trysave(cityent tryent) {
		 tryrepo.save(tryent);
	}
	
	public List<cityent> viewdata() {
		return tryrepo.findAll();
	}

	public void deleteemply(int findid) {
		tryrepo.deleteById(findid);
 
	}
	
	public cityent updatedata(int id,cityent cityent) {
		if(tryrepo.exitByPin(id)) {
			System.out.println("Pincode is already Exits");
			return null;
		}else {
			tryrepo.save(cityent);
			return cityent;
		}
	}
}
