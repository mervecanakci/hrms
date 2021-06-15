package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.TechnologyProgramming;

public interface TechnologyProgrammingService {
	
	Result add(TechnologyProgramming technologyProgramming);
	
	DataResult<List<TechnologyProgramming>> getAll();
}
