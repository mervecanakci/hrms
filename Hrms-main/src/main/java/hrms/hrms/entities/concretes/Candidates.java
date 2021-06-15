package hrms.hrms.entities.concretes;

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

import hrms.hrms.core.dataAcces.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity

@Table(name="candidates_users")

@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","curriculumVitaes"})
public class Candidates {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="candidate_id")
	private int candidateId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="birth_year")
	private int birthYear;
	
	@ManyToOne()
	@JoinColumn(name = "user_id_candidates")
	private Users userCandidate;
	
	@ManyToOne()
	@JoinColumn(name = "verification_code_id_candidates")
	private VerificationCode VerificationCodeCandidates;
	
	@OneToMany(mappedBy = "candidates")
	private List<CurriculumVitae> curriculumVitaes;

	public Candidates() {
		super();
	}

	public Candidates(int candidateId, String firstName, String lastName, String identityNumber, int birthYear,
			Users userCandidate, VerificationCode verificationCodeCandidates, List<CurriculumVitae> curriculumVitaes) {
		super();
		this.candidateId = candidateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthYear = birthYear;
		this.userCandidate = userCandidate;
		VerificationCodeCandidates = verificationCodeCandidates;
		this.curriculumVitaes = curriculumVitaes;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public Users getUserCandidate() {
		return userCandidate;
	}

	public void setUserCandidate(Users userCandidate) {
		this.userCandidate = userCandidate;
	}

	public VerificationCode getVerificationCodeCandidates() {
		return VerificationCodeCandidates;
	}

	public void setVerificationCodeCandidates(VerificationCode verificationCodeCandidates) {
		VerificationCodeCandidates = verificationCodeCandidates;
	}

	public List<CurriculumVitae> getCurriculumVitaes() {
		return curriculumVitaes;
	}

	public void setCurriculumVitaes(List<CurriculumVitae> curriculumVitaes) {
		this.curriculumVitaes = curriculumVitaes;
	}
	
	
}
