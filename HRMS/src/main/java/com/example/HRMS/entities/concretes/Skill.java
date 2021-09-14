package com.example.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Skills")
public class Skill {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id; 
	
	@ManyToOne()
	@JoinColumn(name="cvId",referencedColumnName="Id")
	private CV cv;
	
	@Column(name = "SkillName")
	private String skillName;

	public Skill() {}

	public Skill(int id, String skillName) {
		super();
		this.id = id;
		this.skillName = skillName;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}



}
