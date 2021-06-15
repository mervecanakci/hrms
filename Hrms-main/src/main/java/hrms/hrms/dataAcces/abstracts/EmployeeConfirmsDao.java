package hrms.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.EmployeeConfirms;

public interface EmployeeConfirmsDao  extends JpaRepository<EmployeeConfirms, Integer>{

}
