package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personal")
public class Home {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;

	
	
	public Home(String name) {
		this.name = name;

		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	public String toString(){
		return "Hello" + getName();
	}
	
	

}
