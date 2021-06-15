package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.Schools;

public interface SchoolsService {
	
	DataResult<List<Schools>> getAll();
	
	Result add(Schools schools);
	
	DataResult<List<Schools>> getAllSorted();
}
