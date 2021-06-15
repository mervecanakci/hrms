package hrms.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Department;

public interface DepartmentDao extends JpaRepository<Department , Integer> {
	 
}
