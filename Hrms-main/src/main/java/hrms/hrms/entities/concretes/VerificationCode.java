package hrms.hrms.entities.concretes;

import java.sql.Date;
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

@Table(name="verification_code")

@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidates","employers"})
public class VerificationCode {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="verification_code_id")
	private int verificationCodeId;
	
	@Column(name="code")
	private String code;

	@Column(name="is_verified")
	private boolean isVerified;

	@Column(name="verified_date")
	private Date verifiedDate;
	
	@OneToMany(mappedBy = "VerificationCodeCandidates")
	private List<Candidates> candidates;
	
	@OneToMany(mappedBy = "VerificationCodeEmployers")
	private List<Employers> employers;

	public VerificationCode() {
		super();
	}

	public VerificationCode(int verificationCodeId, String code, boolean isVerified, Date verifiedDate,
			List<Candidates> candidates, List<Employers> employers) {
		super();
		this.verificationCodeId = verificationCodeId;
		this.code = code;
		this.isVerified = isVerified;
		this.verifiedDate = verifiedDate;
		this.candidates = candidates;
		this.employers = employers;
	}

	public int getVerificationCodeId() {
		return verificationCodeId;
	}

	public void setVerificationCodeId(int verificationCodeId) {
		this.verificationCodeId = verificationCodeId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public Date getVerifiedDate() {
		return verifiedDate;
	}

	public void setVerifiedDate(Date verifiedDate) {
		this.verifiedDate = verifiedDate;
	}

	public List<Candidates> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidates> candidates) {
		this.candidates = candidates;
	}

	public List<Employers> getEmployers() {
		return employers;
	}

	public void setEmployers(List<Employers> employers) {
		this.employers = employers;
	}
	
	
}
