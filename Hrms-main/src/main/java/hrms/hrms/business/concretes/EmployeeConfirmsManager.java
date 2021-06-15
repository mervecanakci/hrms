package hrms.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.EmployeeConfirmsService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.core.utilies.result.SuccessDataResult;
import hrms.hrms.core.utilies.result.SuccessResult;
import hrms.hrms.dataAcces.abstracts.EmployeeConfirmsDao;
import hrms.hrms.entities.concretes.EmployeeConfirms;

@Service
public class EmployeeConfirmsManager implements EmployeeConfirmsService{
	
	private EmployeeConfirmsDao employeeConfirmsDao;
	
	@Autowired
	public EmployeeConfirmsManager(EmployeeConfirmsDao employeeConfirmsDao) {
		super();
		this.employeeConfirmsDao = employeeConfirmsDao;
	}

	@Override
	public DataResult<List<EmployeeConfirms>> getAll() {
		return new SuccessDataResult<List<EmployeeConfirms>>(this.employeeConfirmsDao.findAll(),"EmployeeConfirms listed...");
	}

	@Override
	public Result add(EmployeeConfirms employeeConfirms) {
		this.employeeConfirmsDao.save(employeeConfirms);
		return new SuccessResult("ForeignLanguage added..");
	}

}
