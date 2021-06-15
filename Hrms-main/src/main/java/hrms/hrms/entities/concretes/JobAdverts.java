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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity

@Table(name="job_adverts")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidates"})
public class JobAdverts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_advert_id")
	private int jobAdvertsId;
	
	
	@Column(name="is_job_adverts_active")
	private boolean isJobAdvertsActive;
	
	@Column(name="job_definition")
	private String jobDefinition;
	
	@Column(name="min_salary")
	private double minSalary;
	
	@Column(name="max_salary")
	private double maxSalary;
	
	@Column(name="open_position_count")
	private int openPositionCount;
	
	@Column(name="job_advert_create_date")
	private Date jobAdvertCreateDate;
	
	@Column(name="deadline")
	private Date deadline;
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employers employersJobAdverts;
	
	@ManyToOne()
	@JoinColumn(name = "job_position_id")
	private Department departmentJobAdverts;
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City cityJobAdverts;

	public JobAdverts() {
		super();
	}

	public JobAdverts(int jobAdvertsId, boolean isJobAdvertsActive, String jobDefinition, double minSalary,
			double maxSalary, int openPositionCount, Date jobAdvertCreateDate, Date deadline,
			Employers employersJobAdverts, Department departmentJobAdverts, City cityJobAdverts) {
		super();
		this.jobAdvertsId = jobAdvertsId;
		this.isJobAdvertsActive = isJobAdvertsActive;
		this.jobDefinition = jobDefinition;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.openPositionCount = openPositionCount;
		this.jobAdvertCreateDate = jobAdvertCreateDate;
		this.deadline = deadline;
		this.employersJobAdverts = employersJobAdverts;
		this.departmentJobAdverts = departmentJobAdverts;
		this.cityJobAdverts = cityJobAdverts;
	}

	public int getJobAdvertsId() {
		return jobAdvertsId;
	}

	public void setJobAdvertsId(int jobAdvertsId) {
		this.jobAdvertsId = jobAdvertsId;
	}

	public boolean isJobAdvertsActive() {
		return isJobAdvertsActive;
	}

	public void setJobAdvertsActive(boolean isJobAdvertsActive) {
		this.isJobAdvertsActive = isJobAdvertsActive;
	}

	public String getJobDefinition() {
		return jobDefinition;
	}

	public void setJobDefinition(String jobDefinition) {
		this.jobDefinition = jobDefinition;
	}

	public double getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}

	public double getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

	public int getOpenPositionCount() {
		return openPositionCount;
	}

	public void setOpenPositionCount(int openPositionCount) {
		this.openPositionCount = openPositionCount;
	}

	public Date getJobAdvertCreateDate() {
		return jobAdvertCreateDate;
	}

	public void setJobAdvertCreateDate(Date jobAdvertCreateDate) {
		this.jobAdvertCreateDate = jobAdvertCreateDate;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Employers getEmployersJobAdverts() {
		return employersJobAdverts;
	}

	public void setEmployersJobAdverts(Employers employersJobAdverts) {
		this.employersJobAdverts = employersJobAdverts;
	}

	public Department getDepartmentJobAdverts() {
		return departmentJobAdverts;
	}

	public void setDepartmentJobAdverts(Department departmentJobAdverts) {
		this.departmentJobAdverts = departmentJobAdverts;
	}

	public City getCityJobAdverts() {
		return cityJobAdverts;
	}

	public void setCityJobAdverts(City cityJobAdverts) {
		this.cityJobAdverts = cityJobAdverts;
	}
	
	
}
