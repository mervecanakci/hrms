package hrms.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import hrms.hrms.entities.concretes.Employers;

public interface EmployeresDao extends JpaRepository<Employers, Integer > {
	
	
}
