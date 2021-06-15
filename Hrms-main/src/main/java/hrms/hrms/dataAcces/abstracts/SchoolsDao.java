package hrms.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Schools;

public interface SchoolsDao extends JpaRepository<Schools, Integer>{

}
