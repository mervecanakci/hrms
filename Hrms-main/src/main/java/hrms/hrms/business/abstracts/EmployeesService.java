package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.Employees;

public interface EmployeesService {

	DataResult<List<Employees>> getAll();
	
	Result add(Employees employees);
}
