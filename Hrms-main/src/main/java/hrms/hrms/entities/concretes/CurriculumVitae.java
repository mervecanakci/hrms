package hrms.hrms.entities.concretes;
import java.sql.Date;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cv_candidates_users")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","foreignLanguage","schools","images","technologyProgramming","jobExperiences"})
public class CurriculumVitae {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cv_id")
	private int cvId;
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="linked_link")
	private String linkedLink;
	
	@Column(name="description")
	private String description;
	
	@Column(name="create_date_cv")
	private Date createDateCv;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="last_update_date")
	private Date lastUpdateDate;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id_cv")
	private Candidates candidates;
	
	@OneToMany(mappedBy = "curriculumVitaeTechnologyProgramming")
	private List<TechnologyProgramming> technologyProgramming;
	
	@OneToMany(mappedBy = "curriculumVitaeSchools")
	private List<Schools> schools;
	
	@OneToMany(mappedBy = "curriculumVitaeJobExperience")
	private List<JobExperience> jobExperiences;
	
	
	@OneToMany(mappedBy = "curriculumVitaeForeignLanguage")
	private List<ForeignLanguage> foreignLanguage;
	
	@OneToMany(mappedBy = "curriculumVitaeImage")
	private List<Image> images;

	public CurriculumVitae() {
		super();
	}

	public CurriculumVitae(int cvId, String githubLink, String linkedLink, String description, Date createDateCv,
			boolean isActive, Date lastUpdateDate, Candidates candidates,
			List<TechnologyProgramming> technologyProgramming, List<Schools> schools,
			List<JobExperience> jobExperiences, List<ForeignLanguage> foreignLanguage, List<Image> images) {
		super();
		this.cvId = cvId;
		this.githubLink = githubLink;
		this.linkedLink = linkedLink;
		this.description = description;
		this.createDateCv = createDateCv;
		this.isActive = isActive;
		this.lastUpdateDate = lastUpdateDate;
		this.candidates = candidates;
		this.technologyProgramming = technologyProgramming;
		this.schools = schools;
		this.jobExperiences = jobExperiences;
		this.foreignLanguage = foreignLanguage;
		this.images = images;
	}

	public int getCvId() {
		return cvId;
	}

	public void setCvId(int cvId) {
		this.cvId = cvId;
	}

	public String getGithubLink() {
		return githubLink;
	}

	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}

	public String getLinkedLink() {
		return linkedLink;
	}

	public void setLinkedLink(String linkedLink) {
		this.linkedLink = linkedLink;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateDateCv() {
		return createDateCv;
	}

	public void setCreateDateCv(Date createDateCv) {
		this.createDateCv = createDateCv;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Candidates getCandidates() {
		return candidates;
	}

	public void setCandidates(Candidates candidates) {
		this.candidates = candidates;
	}

	public List<TechnologyProgramming> getTechnologyProgramming() {
		return technologyProgramming;
	}

	public void setTechnologyProgramming(List<TechnologyProgramming> technologyProgramming) {
		this.technologyProgramming = technologyProgramming;
	}

	public List<Schools> getSchools() {
		return schools;
	}

	public void setSchools(List<Schools> schools) {
		this.schools = schools;
	}

	public List<JobExperience> getJobExperiences() {
		return jobExperiences;
	}

	public void setJobExperiences(List<JobExperience> jobExperiences) {
		this.jobExperiences = jobExperiences;
	}

	public List<ForeignLanguage> getForeignLanguage() {
		return foreignLanguage;
	}

	public void setForeignLanguage(List<ForeignLanguage> foreignLanguage) {
		this.foreignLanguage = foreignLanguage;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}
	
	
}
