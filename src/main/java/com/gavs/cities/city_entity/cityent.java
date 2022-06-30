package com.gavs.cities.city_entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class cityent {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "pincode")
	private int pin;
	
    @Column(name = "city_name")
	private String c_name;
	
    @Column(name = "dist")
	private String district;
	
    @Column(name = "locate")
	private String location;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCity_Name() {
		return c_name;
	}

	public void setCity_Name(String city_name) {
		this.c_name = city_name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "tryent [pincode=" + pin + ", name=" + c_name + ", dist=" + district + ", location=" + location + "]";
	}

	public cityent(int pin, String c_name, String district, String location) {
		this.pin = pin;
		this.c_name = c_name;
		this.district = district;
		this.location = location;
	}
	public cityent() {
	}

}


