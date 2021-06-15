package hrms.hrms.entities.concretes;

import java.util.List;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_titles")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts","jobExperience"})
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_title_id")
	private int jobTitleId;
	
	@Column(name="title")
	private String title;
	
	@OneToMany(mappedBy = "departmentJobAdverts")
	private List<JobAdverts> jobAdverts;
	
	@OneToMany(mappedBy = "departmentJobExperience")
	private List<JobExperience> jobExperience;

	public Department() {
		super();
	}

	public Department(int jobTitleId, String title, List<JobAdverts> jobAdverts, List<JobExperience> jobExperience) {
		super();
		this.jobTitleId = jobTitleId;
		this.title = title;
		this.jobAdverts = jobAdverts;
		this.jobExperience = jobExperience;
	}

	public int getJobTitleId() {
		return jobTitleId;
	}

	public void setJobTitleId(int jobTitleId) {
		this.jobTitleId = jobTitleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<JobAdverts> getJobAdverts() {
		return jobAdverts;
	}

	public void setJobAdverts(List<JobAdverts> jobAdverts) {
		this.jobAdverts = jobAdverts;
	}

	public List<JobExperience> getJobExperience() {
		return jobExperience;
	}

	public void setJobExperience(List<JobExperience> jobExperience) {
		this.jobExperience = jobExperience;
	}
	
	
}
