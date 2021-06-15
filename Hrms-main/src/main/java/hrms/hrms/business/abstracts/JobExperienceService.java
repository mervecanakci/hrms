package hrms.hrms.business.abstracts;

import java.util.List;


import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {
	
	Result add(JobExperience jobExperience);
	
	DataResult<List<JobExperience>> getAll();
	
	DataResult<List<JobExperience>> getAllSorted();

}
