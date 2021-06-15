package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.EmployersService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.core.utilies.result.SuccessDataResult;
import hrms.hrms.core.utilies.result.SuccessResult;
import hrms.hrms.dataAcces.abstracts.EmployeresDao;
import hrms.hrms.entities.concretes.Employers;

@Service
public class EmployersManager implements EmployersService{

	private EmployeresDao employersDao;
	
	@Autowired
	public EmployersManager(EmployeresDao employersDao) {
		this.employersDao = employersDao;
	}


	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>(this.employersDao.findAll(),"Employers listed..");
	}


	@Override
	public Result add(Employers employers) {
		this.employersDao.save(employers);
		return new SuccessResult("Employers added..");
	}

}
