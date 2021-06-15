package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.VerificationCodeService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.core.utilies.result.SuccessDataResult;
import hrms.hrms.core.utilies.result.SuccessResult;
import hrms.hrms.dataAcces.abstracts.VerificationCodeDao;
import hrms.hrms.entities.concretes.VerificationCode;
@Service
public class VerificationCodeManager implements VerificationCodeService{
	
	private VerificationCodeDao VerificationCodeDao;
	
	@Autowired
	public VerificationCodeManager(hrms.hrms.dataAcces.abstracts.VerificationCodeDao verificationCodeDao) {
		super();
		VerificationCodeDao = verificationCodeDao;
	}

	@Override
	public DataResult<List<VerificationCode>> getAll() {
		return new SuccessDataResult<List<VerificationCode>>(this.VerificationCodeDao.findAll(),"Data listelendi..");
	}

	@Override
	public Result add(VerificationCode verificationCode) {
		this.VerificationCodeDao.save(verificationCode);
		return new SuccessResult("VerificationCode added..");
	}

}
