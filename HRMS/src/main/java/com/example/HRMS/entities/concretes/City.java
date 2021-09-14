package com.example.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisments"})
public class City {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id; 
	
	@Column(name = "Name")
	private String name;
	
	@OneToMany(mappedBy="city")
	private List<JobAdvertisement> jobAdvertisments;
	
	public City() {}

	public City(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	} 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	


}
