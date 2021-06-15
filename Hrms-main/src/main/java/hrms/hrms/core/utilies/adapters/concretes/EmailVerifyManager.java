package hrms.hrms.core.utilies.adapters.concretes;

import hrms.hrms.core.utilies.adapters.abstracts.EmailVerificationService;

public class EmailVerifyManager  implements EmailVerificationService{

	@Override
	public boolean verificationEmail() {
		System.out.println("Verificationed...");
		return false;
	}

}
