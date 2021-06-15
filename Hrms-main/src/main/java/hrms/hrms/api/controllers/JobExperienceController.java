package hrms.hrms.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.JobExperienceService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/jobexperience")
public class JobExperienceController {
	
	private JobExperienceService jobExperienceService;

	@Autowired
	public JobExperienceController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobExperience jobExperience){
		return this.jobExperienceService.add(jobExperience);
	}

	@GetMapping("/getall")
	public DataResult<List<JobExperience>> getAll(){
		return this.jobExperienceService.getAll();
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<JobExperience>> getAllSorted(){
		return this.jobExperienceService.getAllSorted();
	}
}
