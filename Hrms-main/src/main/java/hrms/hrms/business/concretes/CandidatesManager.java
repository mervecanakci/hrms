package hrms.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.CandidatesService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.ErrorResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.core.utilies.result.SuccessDataResult;
import hrms.hrms.core.utilies.result.SuccessResult;
import hrms.hrms.dataAcces.abstracts.CandidatesDao;
import hrms.hrms.entities.concretes.Candidates;

@Service
public class CandidatesManager implements CandidatesService {

	private CandidatesDao candidatesDao;
	
	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao) {
		this.candidatesDao = candidatesDao;
	}

	@Override
	public DataResult<List<Candidates>> getAll() {
		return new SuccessDataResult<List<Candidates>>(this.candidatesDao.findAll(),"Candidates listed..");
	}

	@Override
	public Result add(Candidates candidates) {
		if(candidates.getIdentityNumber().isEmpty()) {
			return new ErrorResult("Candidate doesn't add..");
		}
		this.candidatesDao.save(candidates);
		return new SuccessResult("Candidates added..");
		
	}
	

}
