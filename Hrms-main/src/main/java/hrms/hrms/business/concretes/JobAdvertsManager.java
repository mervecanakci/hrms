package hrms.hrms.business.concretes;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.JobAdvertsService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.core.utilies.result.SuccessDataResult;
import hrms.hrms.core.utilies.result.SuccessResult;
import hrms.hrms.dataAcces.abstracts.JobAdvertsDao;
import hrms.hrms.entities.concretes.JobAdverts;

@Service
public class JobAdvertsManager implements JobAdvertsService{

	private JobAdvertsDao jobAdvertsDao;
	
	@Autowired
	public JobAdvertsManager(JobAdvertsDao jobAdvertsDao) {
		super();
		this.jobAdvertsDao = jobAdvertsDao;
	}

	@Override
	public Result add(JobAdverts jobAdverts) {
		this.jobAdvertsDao.save(jobAdverts);
		return new SuccessResult("JobAdverts added..");
	}

	@Override
	public DataResult<List<JobAdverts>> getAll(){
		return new SuccessDataResult<List<JobAdverts>>(this.jobAdvertsDao.findAll(),"Data listelendi..");
	}

	@Override
	public DataResult<List<JobAdverts>> getByIsActive(boolean isActive) {
		return new SuccessDataResult<List<JobAdverts>>(this.jobAdvertsDao.getByIsActive(isActive),"Başarılı");
	}

	@Override
	public DataResult<List<JobAdverts>> getAllSortedDate(boolean isActive) {
		Sort sort = Sort.by(Sort.Direction.ASC,"deadline");
		return new SuccessDataResult<List<JobAdverts>>(this.jobAdvertsDao.findAll(sort),"Başarılı");
	}

	@Override
	public DataResult<List<JobAdverts>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		return new SuccessDataResult<List<JobAdverts>>(this.jobAdvertsDao.findAll(pageable).getContent(),"Başarılı");
	}

	@Override
	public DataResult<List<JobAdverts>> getByCompanyIsActiveJobAdverts(boolean isActive, int employersId) {
		return new SuccessDataResult<List<JobAdverts>>(this.jobAdvertsDao.getByCompanyIsActiveJobAdverts(isActive,employersId),"Başarılı");
	}

	@Override
	public Result changeJobAdvertsStatus(int jobAdvertsId,int employersID) {
		JobAdverts jobAdvertToChangeActive = this.jobAdvertsDao.findById(employersID).get();
		jobAdvertToChangeActive.setJobAdvertsActive(!jobAdvertToChangeActive.isJobAdvertsActive());
		this.jobAdvertsDao.save(jobAdvertToChangeActive);
		return new SuccessResult("Başarılı");
	}

	
}
