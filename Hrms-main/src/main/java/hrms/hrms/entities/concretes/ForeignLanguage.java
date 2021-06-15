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

@Table(name="foreign_language")
@AllArgsConstructor
@NoArgsConstructor
public class ForeignLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="foreign_language_id")
	private int foreignLanguageId;
	
	@Column(name="language_name")
	private String languageName;
	
	@Column(name="language_level")
	private int languageLevel;
	
	@Column(name="create_date_foreign_language")
	private Date foreignLanguageCreateDate;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private CurriculumVitae curriculumVitaeForeignLanguage;

	public ForeignLanguage() {
		super();
	}

	public ForeignLanguage(int foreignLanguageId, String languageName, int languageLevel,
			Date foreignLanguageCreateDate, CurriculumVitae curriculumVitaeForeignLanguage) {
		super();
		this.foreignLanguageId = foreignLanguageId;
		this.languageName = languageName;
		this.languageLevel = languageLevel;
		this.foreignLanguageCreateDate = foreignLanguageCreateDate;
		this.curriculumVitaeForeignLanguage = curriculumVitaeForeignLanguage;
	}

	public int getForeignLanguageId() {
		return foreignLanguageId;
	}

	public void setForeignLanguageId(int foreignLanguageId) {
		this.foreignLanguageId = foreignLanguageId;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public int getLanguageLevel() {
		return languageLevel;
	}

	public void setLanguageLevel(int languageLevel) {
		this.languageLevel = languageLevel;
	}

	public Date getForeignLanguageCreateDate() {
		return foreignLanguageCreateDate;
	}

	public void setForeignLanguageCreateDate(Date foreignLanguageCreateDate) {
		this.foreignLanguageCreateDate = foreignLanguageCreateDate;
	}

	public CurriculumVitae getCurriculumVitaeForeignLanguage() {
		return curriculumVitaeForeignLanguage;
	}

	public void setCurriculumVitaeForeignLanguage(CurriculumVitae curriculumVitaeForeignLanguage) {
		this.curriculumVitaeForeignLanguage = curriculumVitaeForeignLanguage;
	}
	
	
}
