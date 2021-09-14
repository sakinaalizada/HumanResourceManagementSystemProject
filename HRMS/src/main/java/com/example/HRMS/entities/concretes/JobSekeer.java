package com.example.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JobSekeers")
public class JobSekeer {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;
	
	@OneToOne(mappedBy="jobSekeer")
	private CV cv;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastname;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "IdentificationNumber")
	private String identificationNumber;
	
	public JobSekeer() {}

	public JobSekeer(int id, String firstName, String lastname, String password, String email,
			String identificationNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.password = password;
		this.email = email;
		this.identificationNumber = identificationNumber;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
	

}
