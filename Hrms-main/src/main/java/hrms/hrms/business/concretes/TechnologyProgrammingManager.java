package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.TechnologyProgrammingService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.core.utilies.result.SuccessDataResult;
import hrms.hrms.core.utilies.result.SuccessResult;
import hrms.hrms.dataAcces.abstracts.TechnologyProgrammingDao;
import hrms.hrms.entities.concretes.TechnologyProgramming;

@Service
public class TechnologyProgrammingManager implements TechnologyProgrammingService {

	private TechnologyProgrammingDao technologyProgrammingDao;

	@Autowired
	public TechnologyProgrammingManager(TechnologyProgrammingDao technologyProgrammingDao) {
		super();
		this.technologyProgrammingDao = technologyProgrammingDao;
	}

	@Override
	public Result add(TechnologyProgramming technologyProgramming) {
		this.technologyProgrammingDao.save(technologyProgramming);
		return new SuccessResult("TechnologyProgramming added..");
	}

	@Override
	public DataResult<List<TechnologyProgramming>> getAll() {
		return new SuccessDataResult<List<TechnologyProgramming>>(this.technologyProgrammingDao.findAll(),"Data listelendi..");
	}
	
}
