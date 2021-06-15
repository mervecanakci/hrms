package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.Department;

public interface DepartmentService {
	DataResult<List<Department>> getAll();
	Result add(Department department);
}
