package hrms.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Employees;

public interface EmployeeDao extends JpaRepository<Employees, Integer> {

}
