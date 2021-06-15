package hrms.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae, Integer>{
	
	CurriculumVitae getByCvId(int cvId);
	
}
