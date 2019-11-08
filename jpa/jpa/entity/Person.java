package com.efrei.jpa.entity;

import javax.persistence.*;
import org.springframework.lang.NonNull;
import java.util.*;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NonNull
	private String name;
	
	@OneToMany(targetEntity = Rent.class, mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Rent> rents = new ArrayList <>();
	
	
	protected Person() {
	}
	
	public Person(String name) {
		
		this.name = name;
	}
	
	public Long getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
