package hrms.hrms.business.abstracts;

import java.util.List;


import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.JobAdverts;

public interface JobAdvertsService {
	
	Result add(JobAdverts jobAdverts);
	
	Result changeJobAdvertsStatus(int jobAdvertsId,int employersId);
	
	DataResult<List<JobAdverts>> getAll();
	
	DataResult<List<JobAdverts>> getAll(int pageNo,int pageSize);
	
	DataResult<List<JobAdverts>> getAllSortedDate(boolean isActive);
	
	DataResult<List<JobAdverts>> getByIsActive(boolean isActive);
	
	DataResult<List<JobAdverts>> getByCompanyIsActiveJobAdverts(boolean isActive,int employersId);
	
}
