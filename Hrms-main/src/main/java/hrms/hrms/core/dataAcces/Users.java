package hrms.hrms.core.dataAcces;


import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import hrms.hrms.entities.concretes.Candidates;
import hrms.hrms.entities.concretes.Employees;
import hrms.hrms.entities.concretes.Employers;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidates","employers","employees"})
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@OneToMany(mappedBy = "userEmployer")
	private List<Employers> employers;
	
	@OneToMany(mappedBy = "userCandidate")
	private List<Candidates> candidates;
	
	@OneToMany(mappedBy = "userEmployee")
	private List<Employees> employees;

	public Users() {
		super();
	}

	public Users(int id, String email, String password, List<Employers> employers, List<Candidates> candidates,
			List<Employees> employees) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.employers = employers;
		this.candidates = candidates;
		this.employees = employees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Employers> getEmployers() {
		return employers;
	}

	public void setEmployers(List<Employers> employers) {
		this.employers = employers;
	}

	public List<Candidates> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidates> candidates) {
		this.candidates = candidates;
	}

	public List<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}

	
}
