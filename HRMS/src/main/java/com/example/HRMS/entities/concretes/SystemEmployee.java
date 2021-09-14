package com.example.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SystemEmployees")
public class SystemEmployee  {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastname;
	
	//@Column(name = "JobPositionId")
	//private String JobPositionId;
	
	@OneToOne()
	@JoinColumn(name="SystemJobPositionId",referencedColumnName="Id")
	private SystemJobPosition systemJobPosition;
	
	public SystemEmployee() {}

	public SystemEmployee(int id, String firstName, String lastname, SystemJobPosition systemJobPosition) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.systemJobPosition = systemJobPosition;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public SystemJobPosition getSystemJobPosition() {
		return systemJobPosition;
	}

	public void setSystemJobPosition(SystemJobPosition systemJobPosition) {
		this.systemJobPosition = systemJobPosition;
	}

	
	


}
