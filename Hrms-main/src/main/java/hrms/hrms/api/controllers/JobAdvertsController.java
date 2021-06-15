package hrms.hrms.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.JobAdvertsService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.JobAdverts;

@RestController
@RequestMapping("/api/jobadverts")
public class JobAdvertsController {
	
	private JobAdvertsService jobAdvertsService;

	@Autowired
	public JobAdvertsController(JobAdvertsService jobAdvertsService) {
		super();
		this.jobAdvertsService = jobAdvertsService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdverts jobAdverts) {
		return this.jobAdvertsService.add(jobAdverts);
	}
	
	@PostMapping("/changeJobAdvertsStatus")
	public Result changeJobAdvertsStatus(@RequestParam("jobAdvertsId") int jobAdvertsId,@RequestParam("employersID") int employersID) {
		return this.jobAdvertsService.changeJobAdvertsStatus(jobAdvertsId,employersID);
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdverts>> getAll(){
		return this.jobAdvertsService.getAll();
	}
	
	@GetMapping("getByIsActive")
	public DataResult<List<JobAdverts>> getByIsActive(@RequestParam boolean isActive){
		return this.jobAdvertsService.getByIsActive(isActive);
	}
	
	@GetMapping("/getAllDateAsc")
	public DataResult<List<JobAdverts>> getAllSortedDate(boolean isActive){
		return this.jobAdvertsService.getAllSortedDate(isActive);
	}
	
	@GetMapping("/getAllByPage")
	public DataResult<List<JobAdverts>> getAllByPage(int pageNo,int pageSize){
		return this.jobAdvertsService.getAll(pageNo,pageSize);
	}
	
	@GetMapping("getByCompanyIsActiveJobAdverts")
	public DataResult<List<JobAdverts>> getByCompanyIsActiveJobAdverts(@RequestParam("isActive") boolean isActive,@RequestParam("employersId") int employersId){
		return this.jobAdvertsService.getByCompanyIsActiveJobAdverts(isActive,employersId);
	}
}
