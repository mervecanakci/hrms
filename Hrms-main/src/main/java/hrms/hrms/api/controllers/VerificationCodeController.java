package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.VerificationCodeService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.VerificationCode;

@RestController
@RequestMapping("/api/verificationCode")
public class VerificationCodeController {

	private VerificationCodeService verificationCodeService;

	@Autowired
	public VerificationCodeController(VerificationCodeService verificationCodeService) {
		super();
		this.verificationCodeService = verificationCodeService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody VerificationCode verificationCode) {
		return this.verificationCodeService.add(verificationCode);
	}
	
	@GetMapping("/getall")
	public DataResult<List<VerificationCode>> getAll(){
		return this.verificationCodeService.getAll();
	}
	
}
