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


@Table(name="employees_users")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employeeConfirms"})
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@ManyToOne()
	@JoinColumn(name = "user_id_employee")
	private Users userEmployee;
	
	@OneToMany(mappedBy = "employees")
	private List<EmployeeConfirms> employeeConfirms;

	public Employees() {
		super();
	}

	public Employees(int employeeId, String firstName, String lastName, Users userEmployee,
			List<EmployeeConfirms> employeeConfirms) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userEmployee = userEmployee;
		this.employeeConfirms = employeeConfirms;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public Users getUserEmployee() {
		return userEmployee;
	}

	public void setUserEmployee(Users userEmployee) {
		this.userEmployee = userEmployee;
	}

	public List<EmployeeConfirms> getEmployeeConfirms() {
		return employeeConfirms;
	}

	public void setEmployeeConfirms(List<EmployeeConfirms> employeeConfirms) {
		this.employeeConfirms = employeeConfirms;
	}
	
	
}
