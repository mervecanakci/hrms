package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.EmployeeConfirms;

public interface EmployeeConfirmsService {
	
	DataResult<List<EmployeeConfirms>> getAll();
	
	Result add(EmployeeConfirms employeeConfirms);
}
