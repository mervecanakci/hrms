package hrms.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.CurriculumVitaeService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.core.utilies.result.SuccessDataResult;
import hrms.hrms.core.utilies.result.SuccessResult;
import hrms.hrms.dataAcces.abstracts.CurriculumVitaeDao;
import hrms.hrms.entities.concretes.CurriculumVitae;

@Service
public class CurriculumVitaeManager implements CurriculumVitaeService{
	
	private CurriculumVitaeDao curriculumVitaeDao;
	
	@Autowired
	public CurriculumVitaeManager(CurriculumVitaeDao curriculumVitaeDao) {
		super();
		this.curriculumVitaeDao = curriculumVitaeDao;
	}

	@Override
	public Result add(CurriculumVitae curriculumVitae) {
		this.curriculumVitaeDao.save(curriculumVitae);
		return new SuccessResult("CurriculumVitae added..");
	}

	@Override
	public DataResult<List<CurriculumVitae>> getAll() {
		return new SuccessDataResult<List<CurriculumVitae>>(this.curriculumVitaeDao.findAll(),"CurriculumVitae listed..");
	}

	@Override
	public DataResult<CurriculumVitae> getByCvId(int cvId) {
		return new SuccessDataResult<CurriculumVitae>
		(this.curriculumVitaeDao.getByCvId(cvId),"Data listelendi..");
	}


}
