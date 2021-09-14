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
@Table(name = "JobPositions")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisments"})
public class JobPosition{
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;
	
	@Column(name = "Name")
	private String name;
	
	@OneToMany(mappedBy="jobPosition")
	private List<JobAdvertisement> JobAdvertisments; 
	
	public JobPosition(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public JobPosition() {}
	
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
