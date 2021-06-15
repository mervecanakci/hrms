package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeService {
	
	Result add(CurriculumVitae curriculumVitae);
	
	DataResult<List<CurriculumVitae>> getAll();
	
	DataResult<CurriculumVitae> getByCvId(int cvId);
	
}
