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
@Table(name = "JobAdvertisements")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;
	
	//@Column(name = "JobPositionId")
	//private int JobPositionId;
	
	//@Column(name = "CityId")
	//private String CityId;
	
	@Column(name = "JobDescription")
	private String jobDescription;
	
	@Column(name = "MaxSalary")
	private int maxSalary;
	
	@Column(name = "MinSalary")
	private int minSalary;
	
	@Column(name = "Deadline")
	private Date deadline;
	
	@Column(name="PublishedDate")
	private Date publishedDate;
	
	@Column(name="IsActive")
	private boolean isActive;
	
	@ManyToOne()
	@JoinColumn(name="CityId",referencedColumnName="Id")
	private City city;
	
	@ManyToOne()
	@JoinColumn(name="JobPositionId",referencedColumnName="Id")
	private JobPosition jobPosition;
	
	@ManyToOne()
	@JoinColumn(name="EmployerId",referencedColumnName="Id")
	private Employer employer;
	
	@Column(name="WorkRemotely")
	private boolean workRemotely;
	
	@Column(name="IsPartTime")
	private boolean isPartTime;
	
	@Column(name="IsFullTime")
	private boolean isFullTime;

	public JobAdvertisement() {}

	public JobAdvertisement(int id, String jobDescription, int maxSalary, int minSalary, Date deadline,
			Date publishedDate, City city, JobPosition jobPosition, Employer employer,
			boolean isActive,  boolean workRemotely, boolean isPartTime, boolean isFullTime) {
		super();
		this.id = id;
		this.jobDescription = jobDescription;
		this.maxSalary = maxSalary;
		this.minSalary = minSalary;
		this.deadline = deadline;
		this.publishedDate = publishedDate;
		this.city = city;
		this.jobPosition = jobPosition;
		this.employer = employer;
		this.isActive = isActive;
		this.workRemotely = workRemotely;
		this.isPartTime = isPartTime;
		this.isFullTime = isFullTime;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline){
		  
	    try {
			this.deadline = new SimpleDateFormat("yyyy-MM-dd").parse(deadline);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public Date getPublishedDate() {
		return publishedDate;
	}
	
	public void setPublishedDate(String publishedDate){
		  
	    try {
			this.publishedDate = new SimpleDateFormat("yyyy-MM-dd").parse(publishedDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public JobPosition getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(JobPosition jobPosition) {
		this.jobPosition = jobPosition;
	}
	
	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	public boolean isWorkRemotely() {
		return workRemotely;
	}

	public void setWorkRemotely(boolean workRemotely) {
		this.workRemotely = workRemotely;
	}

	public boolean isPartTime() {
		return isPartTime;
	}

	public void setPartTime(boolean isPartTime) {
		this.isPartTime = isPartTime;
	}

	public boolean isFullTime() {
		return isFullTime;
	}

	public void setFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
	}

	
	
	
	

}
