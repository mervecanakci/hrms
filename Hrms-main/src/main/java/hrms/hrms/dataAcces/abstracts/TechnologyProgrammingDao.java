package hrms.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.TechnologyProgramming;

public interface TechnologyProgrammingDao extends JpaRepository<TechnologyProgramming, Integer> {

}
