package hrms.hrms.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.SchoolsService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.Schools;

@RestController
@RequestMapping("/api/schools")
public class SchoolsController {
	
	private SchoolsService schoolsService;

	@Autowired
	public SchoolsController(SchoolsService schoolsService) {
		super();
		this.schoolsService = schoolsService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Schools schools) {
		return this.schoolsService.add(schools);
	}

	@GetMapping("/getall")
	public DataResult<List<Schools>> getAll(){
		return this.schoolsService.getAll();
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<Schools>> getAllSorted(){
		return this.schoolsService.getAllSorted();
	}
}
