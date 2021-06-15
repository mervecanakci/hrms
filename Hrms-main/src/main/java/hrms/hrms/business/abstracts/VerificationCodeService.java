package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {
	
	
	DataResult<List<VerificationCode>> getAll();
	
	Result add(VerificationCode verificationCode);
}
