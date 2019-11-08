package com.efrei.jpa.entity;

import javax.persistence.*;

@Entity
public abstract class Vehicule {

	private String plateNumber;
	
	public Vehicule() {
		super();
	}
	
	public Vehicule(String plateNumber) {
		super();
		this.setPlateNumber(plateNumber); 
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
}
