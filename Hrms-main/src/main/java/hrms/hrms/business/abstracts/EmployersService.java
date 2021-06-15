package hrms.hrms.business.abstracts;

import java.util.List;


import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.Employers;

public interface EmployersService {
	
	DataResult<List<Employers>> getAll();
	
	Result add(Employers employers);
	
	
}
