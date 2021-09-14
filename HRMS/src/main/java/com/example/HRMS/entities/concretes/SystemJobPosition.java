package com.example.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "SystemJobPositions")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","systemEmployee"})

public class SystemJobPosition {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;
	
	@Column(name = "Name")
	private String name;
	
	@OneToOne(mappedBy="systemJobPosition")
	private SystemEmployee systemEmployee;
	
	public SystemJobPosition() {}

	public SystemJobPosition(int id, String name, SystemEmployee systemEmployee) {
		super();
		this.id = id;
		this.name = name;
		this.systemEmployee = systemEmployee;
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

	public SystemEmployee getSystemEmployee() {
		return systemEmployee;
	}

	public void setSystemEmployee(SystemEmployee systemEmployee) {
		this.systemEmployee = systemEmployee;
	}

	
	

}
