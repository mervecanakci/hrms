package hrms.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.SchoolsService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.core.utilies.result.SuccessDataResult;
import hrms.hrms.core.utilies.result.SuccessResult;
import hrms.hrms.dataAcces.abstracts.SchoolsDao;
import hrms.hrms.entities.concretes.Schools;

@Service
public class SchoolsManager implements SchoolsService {

	private SchoolsDao schoolDao;
	
	@Autowired
	public SchoolsManager(SchoolsDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public DataResult<List<Schools>> getAll() {
		return new SuccessDataResult<List<Schools>>(this.schoolDao.findAll(),"Data listelendi..");
	}

	@Override
	public Result add(Schools schools) {
		this.schoolDao.save(schools);
		return new SuccessResult("TechnologyProgramming added..");
	}

	@Override
	public DataResult<List<Schools>> getAllSorted() {
		
		Schools schools = new Schools();
		
		if(schools.getGraduationYear() == null) {
			Sort sort = Sort.by(Sort.Direction.ASC,"schoolName");
			return new SuccessDataResult<List<Schools>>(this.schoolDao.findAll(sort),"Başarılı");
		}else {
			Sort sort = Sort.by(Sort.Direction.DESC,"graduationYear");
			return new SuccessDataResult<List<Schools>>(this.schoolDao.findAll(sort),"Başarılı");
		}
		
		
	}

}
