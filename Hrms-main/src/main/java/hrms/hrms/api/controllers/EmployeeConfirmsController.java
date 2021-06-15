package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.EmployeeConfirmsService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.EmployeeConfirms;
@RestController
@RequestMapping("/api/employeeconfirms")
public class EmployeeConfirmsController {

	private EmployeeConfirmsService employeeConfirmsService;

	@Autowired
	public EmployeeConfirmsController(EmployeeConfirmsService employeeConfirmsService) {
		super();
		this.employeeConfirmsService = employeeConfirmsService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody EmployeeConfirms employeeConfirms) {
		return this.employeeConfirmsService.add(employeeConfirms);
	}

	@GetMapping("/getall")
	public DataResult<List<EmployeeConfirms>> getAll(){
		return this.employeeConfirmsService.getAll();
	}
}
