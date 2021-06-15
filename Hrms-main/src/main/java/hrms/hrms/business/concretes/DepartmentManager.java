package hrms.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.DepartmentService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.core.utilies.result.SuccessDataResult;
import hrms.hrms.core.utilies.result.SuccessResult;
import hrms.hrms.dataAcces.abstracts.DepartmentDao;
import hrms.hrms.entities.concretes.Department;

@Service
public class DepartmentManager implements DepartmentService{
	
	private DepartmentDao departmentDao;
	
	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}

	@Override
	public DataResult<List<Department>> getAll() {
		return new SuccessDataResult<List<Department>>(this.departmentDao.findAll(),"Departments listed..");
	}

	@Override
	public Result add(Department department) {
		this.departmentDao.save(department);
		return new SuccessResult("Department added..");
	}
	
	
}
