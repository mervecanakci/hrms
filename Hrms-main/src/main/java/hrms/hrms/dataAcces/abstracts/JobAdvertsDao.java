package hrms.hrms.dataAcces.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hrms.hrms.entities.concretes.JobAdverts;

public interface JobAdvertsDao extends JpaRepository<JobAdverts, Integer> {
	
	@Query("From JobAdverts where isJobAdvertsActive=:isActive")
	List<JobAdverts> getByIsActive(boolean isActive);
	//8- SELECT * FROM public.job_adverts where is_job_adverts_active = true;
	

	@Query("From JobAdverts where isJobAdvertsActive=:isActive")
	List<JobAdverts> getAllSorted(boolean isActive);
	//9- select * from JobAdverts where isJobAdvertActive = true Order deadline Asc
	
	
	@Query("From JobAdverts where isJobAdvertsActive=:isActive and employersJobAdverts.employersId=:employersId")
	List<JobAdverts> getByCompanyIsActiveJobAdverts(boolean isActive,int employersId);
	//10- select * from JobAdverts where isJobAdvertActive = true and employers.employers_id = id
	
}
