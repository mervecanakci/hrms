package hrms.hrms.core.entities;


import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.core.dataAcces.Users;

public interface UserDao extends JpaRepository<Users , Integer>{
	
	boolean existsByEmail(String email);

}
