package hrms.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.EmployeesService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.core.utilies.result.SuccessDataResult;
import hrms.hrms.core.utilies.result.SuccessResult;
import hrms.hrms.dataAcces.abstracts.EmployeeDao;
import hrms.hrms.entities.concretes.Employees;

@Service
public class EmployeesManager implements EmployeesService{
	
	private EmployeeDao employeesDao;
	
	@Autowired
	public EmployeesManager(EmployeeDao employeesDao) {
		super();
		this.employeesDao = employeesDao;
	}

	@Override
	public DataResult<List<Employees>> getAll() {
		return new SuccessDataResult<List<Employees>>(this.employeesDao.findAll(),"Employers listed..");
	}

	@Override
	public Result add(Employees employees) {
		this.employeesDao.save(employees);
		return new SuccessResult("Employers added..");
	}

}
