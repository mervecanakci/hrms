package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.Candidates;

public interface CandidatesService {
	
	DataResult<List<Candidates>> getAll();
	
	Result add(Candidates candidates);
}
