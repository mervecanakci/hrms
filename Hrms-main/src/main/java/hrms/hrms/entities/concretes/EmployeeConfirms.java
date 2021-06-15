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

@Table(name="employee_confirms")

@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employers"})
public class EmployeeConfirms {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employee_confirm_id")
	private int employeeConfirmId;
	
	@Column(name="is_confirmed")
	private boolean isConfirmed;
	
	@Column(name="confirmed_date")
	private Date confirmedDate;
	
	@ManyToOne()
	@JoinColumn(name = "employee_id")
	private Employees employees;
	
	@OneToMany(mappedBy = "employeeConfirmsEmployers")
	private List<Employers> employers;

	public EmployeeConfirms() {
		super();
	}

	public EmployeeConfirms(int employeeConfirmId, boolean isConfirmed, Date confirmedDate, Employees employees,
			List<Employers> employers) {
		super();
		this.employeeConfirmId = employeeConfirmId;
		this.isConfirmed = isConfirmed;
		this.confirmedDate = confirmedDate;
		this.employees = employees;
		this.employers = employers;
	}

	public int getEmployeeConfirmId() {
		return employeeConfirmId;
	}

	public void setEmployeeConfirmId(int employeeConfirmId) {
		this.employeeConfirmId = employeeConfirmId;
	}

	public boolean isConfirmed() {
		return isConfirmed;
	}

	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public Date getConfirmedDate() {
		return confirmedDate;
	}

	public void setConfirmedDate(Date confirmedDate) {
		this.confirmedDate = confirmedDate;
	}

	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public List<Employers> getEmployers() {
		return employers;
	}

	public void setEmployers(List<Employers> employers) {
		this.employers = employers;
	}
	
	
}
