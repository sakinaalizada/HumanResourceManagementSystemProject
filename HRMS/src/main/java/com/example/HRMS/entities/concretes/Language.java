package com.example.HRMS.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Languages")
public class Language {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id; 
	
	@ManyToOne()
	@JoinColumn(name="cvId",referencedColumnName="Id")
	private CV cv;
	
	@Column(name = "LanguageName")
	private String languageName;

	@Column(name = "Level")
	private int level;
	
	public Language() {}
	
	public Language(int id, String languageName, int level) {
		super();
		this.id = id;
		this.languageName = languageName;
		this.level = level;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
