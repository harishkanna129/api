package com.gavs.cities.cityrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gavs.cities.city_entity.cityent;

@Repository
public interface tryrepointer extends JpaRepository<cityent, Integer> {
	
	public boolean exitByPin(int pin);

}
