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
@Table(name = "Employers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisments"})
public class Employer {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id; 
	
	public Employer(int id) {
		super();
		this.id = id;
	}

	@Column(name = "CompanyName")
	private String companyName;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "Website")
	private String website;
	
	@OneToMany(mappedBy="employer")
	private List<JobAdvertisement> jobAdvertisments; 
	
	public Employer() {}
	
	public Employer(int id, String companyName, String email, String password, String website) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.email = email;
		this.password = password;
		this.website = website;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	
	

}
