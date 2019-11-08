package com.efrei.jpa.entity;


import java.util.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.lang.NonNull;

import javax.persistence.*;

public class Rent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date beginRent;
	
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date endRent;
	
	@ManyToOne
	@NonNull
	private Person person;
	
	@OneToMany(targetEntity = Vehicule.class, mappedBy = "rent", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Rent> rents = new ArrayList <>();
	
	protected Rent() {
	}
	
	public Rent(Date beginRent, Date endRent, Person person) {
		this.beginRent = beginRent;
		this.endRent = endRent;
		this.person = person;
	}
	
}
