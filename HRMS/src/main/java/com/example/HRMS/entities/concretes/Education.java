package com.example.HRMS.entities.concretes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Education")
public class Education {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id; 

	@ManyToOne()
	@JoinColumn(name="cvId",referencedColumnName="Id")
	private CV cv;
	
	@Column(name = "UniversityName")
	private String universityName; 

	@Column(name = "Degree")
	private String degree; 
	
	@Column(name = "Major")
	private String major; 
	
	@Column(name = "AdmittanceDate")
	private Date admittanceDate;
	
	@Column(name = "GraduationDate")
	private Date graduationDate;
	
	public Education() {}
	
	public Education(int id, String universityName, String degree, String major, Date admittanceDate,
			Date graduationDate) {
		super();
		this.id = id;
		this.universityName = universityName;
		this.degree = degree;
		this.major = major;
		this.admittanceDate = admittanceDate;
		this.graduationDate = graduationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Date getAdmittanceDate() {
		return admittanceDate;
	}

	public void setAdmittanceDate(String admittanceDate){
  
	    try {
			this.admittanceDate = new SimpleDateFormat("yyyy-MM-dd").parse(admittanceDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	 }

	public Date getGraduationDate() {
		return graduationDate;
	}
	
	public void setGraduationDate(String graduationDate){
		  
	      try {
				this.graduationDate = new SimpleDateFormat("yyyy-MM-dd").parse(graduationDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		 }

	
}
