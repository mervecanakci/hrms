package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.ForeignLanguage;

public interface ForeignLanguageService {
	
	DataResult<List<ForeignLanguage>> getAll();
	
	Result add(ForeignLanguage foreignLanguage);
}
