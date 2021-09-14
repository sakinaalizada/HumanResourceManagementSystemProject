package com.example.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "CVs")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","workExperiences","education","languages","skills"})
public class CV {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;
	
	@OneToOne
	@JoinColumn(name="JobSekeerId",referencedColumnName="Id")
	private JobSekeer jobSekeer;
	
	
	@OneToMany(mappedBy="cv")
	private List<Education> education;
	
	@OneToMany(mappedBy="cv")
	private List<WorkExperience> workExperiences;
	
	@OneToMany(mappedBy="cv")
	private List<Language> languages;
	
	@OneToMany(mappedBy="cv")
	private List<Skill> skills;
	
	@Column(name = "PhotoUrl")
	private String photoUrl;
	
	@Column(name = "GithubUrl")
	private String githubUrl;
	
	@Column(name = "LinkedinUrl")
	private String linkedinUrl;
	
	@Column(name = " ResumeIntroduction")
	private String  resumeIntroduction;

	public CV() {}
	
	public CV(int id, List<Education> education, List<WorkExperience> workExperiences, List<Language> languages,
			String photoUrl, String githubUrl, String linkedinUrl, List<Skill> skills, String resumeIntroduction) {
		super();
		this.id = id;
		this.education = education;
		this.workExperiences = workExperiences;
		this.languages = languages;
		this.photoUrl = photoUrl;
		this.githubUrl = githubUrl;
		this.linkedinUrl = linkedinUrl;
		this.skills = skills;
		this.resumeIntroduction = resumeIntroduction;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public List<WorkExperience> getWorkExperiences() {
		return workExperiences;
	}

	public void setWorkExperiences(List<WorkExperience> workExperiences) {
		this.workExperiences = workExperiences;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getGithubUrl() {
		return githubUrl;
	}

	public void setGithubUrl(String githubUrl) {
		this.githubUrl = githubUrl;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}


	public String getResumeIntroduction() {
		return resumeIntroduction;
	}

	public void setResumeIntroduction(String resumeIntroduction) {
		this.resumeIntroduction = resumeIntroduction;
	}
	
	
	
	
	
	

}
