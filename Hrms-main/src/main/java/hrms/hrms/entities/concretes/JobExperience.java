package hrms.hrms.entities.concretes;

import java.sql.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity

@Table(name="job_experience")
@AllArgsConstructor
@NoArgsConstructor
public class JobExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_experience_id")
	private int jobExperienceId;
	
	
	@Column(name="start_year")
	private Date startYear;
	
	@Column(name="leave_year")
	private Date leaveYear;
	
	@Column(name="create_date_job_experience")
	private Date createDateYear;
	
	@Column(name="workplace_name")
	private String workplaceName;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private CurriculumVitae curriculumVitaeJobExperience;
	
	@ManyToOne()
	@JoinColumn(name = "place_of_business_position_id")
	private Department departmentJobExperience;

	public JobExperience() {
		super();
	}

	public JobExperience(int jobExperienceId, Date startYear, Date leaveYear, Date createDateYear, String workplaceName,
			CurriculumVitae curriculumVitaeJobExperience, Department departmentJobExperience) {
		super();
		this.jobExperienceId = jobExperienceId;
		this.startYear = startYear;
		this.leaveYear = leaveYear;
		this.createDateYear = createDateYear;
		this.workplaceName = workplaceName;
		this.curriculumVitaeJobExperience = curriculumVitaeJobExperience;
		this.departmentJobExperience = departmentJobExperience;
	}

	public int getJobExperienceId() {
		return jobExperienceId;
	}

	public void setJobExperienceId(int jobExperienceId) {
		this.jobExperienceId = jobExperienceId;
	}

	public Date getStartYear() {
		return startYear;
	}

	public void setStartYear(Date startYear) {
		this.startYear = startYear;
	}

	public Date getLeaveYear() {
		return leaveYear;
	}

	public void setLeaveYear(Date leaveYear) {
		this.leaveYear = leaveYear;
	}

	public Date getCreateDateYear() {
		return createDateYear;
	}

	public void setCreateDateYear(Date createDateYear) {
		this.createDateYear = createDateYear;
	}

	public String getWorkplaceName() {
		return workplaceName;
	}

	public void setWorkplaceName(String workplaceName) {
		this.workplaceName = workplaceName;
	}

	public CurriculumVitae getCurriculumVitaeJobExperience() {
		return curriculumVitaeJobExperience;
	}

	public void setCurriculumVitaeJobExperience(CurriculumVitae curriculumVitaeJobExperience) {
		this.curriculumVitaeJobExperience = curriculumVitaeJobExperience;
	}

	public Department getDepartmentJobExperience() {
		return departmentJobExperience;
	}

	public void setDepartmentJobExperience(Department departmentJobExperience) {
		this.departmentJobExperience = departmentJobExperience;
	}
	
	
}
