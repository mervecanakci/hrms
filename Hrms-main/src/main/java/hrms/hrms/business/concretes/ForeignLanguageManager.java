package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.ForeignLanguageService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.core.utilies.result.SuccessDataResult;
import hrms.hrms.core.utilies.result.SuccessResult;
import hrms.hrms.dataAcces.abstracts.ForeignLanguageDao;
import hrms.hrms.entities.concretes.ForeignLanguage;
@Service
public class ForeignLanguageManager implements ForeignLanguageService{
	
	private ForeignLanguageDao foreignLanguageDao;
	
	@Autowired
	public ForeignLanguageManager(ForeignLanguageDao foreignLanguageDao) {
		super();
		this.foreignLanguageDao = foreignLanguageDao;
	}

	@Override
	public DataResult<List<ForeignLanguage>> getAll() {
		return new SuccessDataResult<List<ForeignLanguage>>(this.foreignLanguageDao.findAll(),"Data listelendi..");
	}

	@Override
	public Result add(ForeignLanguage foreignLanguage) {
		
		if(foreignLanguage.getLanguageLevel() > 5 && foreignLanguage.getLanguageLevel() <= 5 ) {
			return new SuccessResult("Foreign language doesn't add..");
		}
		
		this.foreignLanguageDao.save(foreignLanguage);
		return new SuccessResult("ForeignLanguage added..");
	}

}
