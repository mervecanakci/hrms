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

@Table(name="schools")
@AllArgsConstructor
@NoArgsConstructor
public class Schools {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="school_id")
	private int schoolId;

	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="chapter")
	private String chapter;
	
	@Column(name="start_year")
	private Date startYear;
	
	@Column(name="graduation_year")
	private Date graduationYear;
	
	@Column(name="create_date_schools")
	private Date createDateYear;
	
	@Column(name="graduation_state")
	private String graduationState;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private CurriculumVitae curriculumVitaeSchools;

	public Schools() {
		super();
	}

	public Schools(int schoolId, String schoolName, String chapter, Date startYear, Date graduationYear,
			Date createDateYear, String graduationState, CurriculumVitae curriculumVitaeSchools) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.chapter = chapter;
		this.startYear = startYear;
		this.graduationYear = graduationYear;
		this.createDateYear = createDateYear;
		this.graduationState = graduationState;
		this.curriculumVitaeSchools = curriculumVitaeSchools;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public Date getStartYear() {
		return startYear;
	}

	public void setStartYear(Date startYear) {
		this.startYear = startYear;
	}

	public Date getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(Date graduationYear) {
		this.graduationYear = graduationYear;
	}

	public Date getCreateDateYear() {
		return createDateYear;
	}

	public void setCreateDateYear(Date createDateYear) {
		this.createDateYear = createDateYear;
	}

	public String getGraduationState() {
		return graduationState;
	}

	public void setGraduationState(String graduationState) {
		this.graduationState = graduationState;
	}

	public CurriculumVitae getCurriculumVitaeSchools() {
		return curriculumVitaeSchools;
	}

	public void setCurriculumVitaeSchools(CurriculumVitae curriculumVitaeSchools) {
		this.curriculumVitaeSchools = curriculumVitaeSchools;
	}
	
	
}
