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
@Table(name = "WorkExperiences")
public class WorkExperience {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id; 
	
	@ManyToOne()
	@JoinColumn(name="cvId",referencedColumnName="Id")
	private CV cv;
	
	@Column(name = "WorkPlaceName")
	private String workPlaceName; 
	
	@Column(name = "Position")
	private String position; 
	
	@Column(name = "StartDate")
	private Date startDate; 
	
	@Column(name = "EndDate")
	private Date endDate;
	
	public WorkExperience() {}

	public WorkExperience(int id, String workPlaceName, String position, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.workPlaceName = workPlaceName;
		this.position = position;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWorkPlaceName() {
		return workPlaceName;
	}

	public void setWorkPlaceName(String workPlaceName) {
		this.workPlaceName = workPlaceName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate){
		  
	    try {
			this.startDate = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	 

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate){
		  
	    try {
			this.endDate = new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	 

	
	

}
