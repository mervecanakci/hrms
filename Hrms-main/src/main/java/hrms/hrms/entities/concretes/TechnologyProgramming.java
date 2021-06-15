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

@Table(name="technology_programming")
@AllArgsConstructor
@NoArgsConstructor
public class TechnologyProgramming {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="technology_programming_id")
	private int technologyProgrammingId;
	
	@Column(name="technology_programming_name")
	private String technologyProgrammingName;
	
	@Column(name="create_date_foreign_language")
	private Date createDateForeignLanguage;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private CurriculumVitae curriculumVitaeTechnologyProgramming;

	public TechnologyProgramming() {
		super();
	}

	public TechnologyProgramming(int technologyProgrammingId, String technologyProgrammingName,
			Date createDateForeignLanguage, CurriculumVitae curriculumVitaeTechnologyProgramming) {
		super();
		this.technologyProgrammingId = technologyProgrammingId;
		this.technologyProgrammingName = technologyProgrammingName;
		this.createDateForeignLanguage = createDateForeignLanguage;
		this.curriculumVitaeTechnologyProgramming = curriculumVitaeTechnologyProgramming;
	}

	public int getTechnologyProgrammingId() {
		return technologyProgrammingId;
	}

	public void setTechnologyProgrammingId(int technologyProgrammingId) {
		this.technologyProgrammingId = technologyProgrammingId;
	}

	public String getTechnologyProgrammingName() {
		return technologyProgrammingName;
	}

	public void setTechnologyProgrammingName(String technologyProgrammingName) {
		this.technologyProgrammingName = technologyProgrammingName;
	}

	public Date getCreateDateForeignLanguage() {
		return createDateForeignLanguage;
	}

	public void setCreateDateForeignLanguage(Date createDateForeignLanguage) {
		this.createDateForeignLanguage = createDateForeignLanguage;
	}

	public CurriculumVitae getCurriculumVitaeTechnologyProgramming() {
		return curriculumVitaeTechnologyProgramming;
	}

	public void setCurriculumVitaeTechnologyProgramming(CurriculumVitae curriculumVitaeTechnologyProgramming) {
		this.curriculumVitaeTechnologyProgramming = curriculumVitaeTechnologyProgramming;
	}
	
}
