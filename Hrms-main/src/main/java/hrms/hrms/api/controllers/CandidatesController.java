package hrms.hrms.api.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.CandidatesService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.Candidates;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	
	private CandidatesService candidatesService;

	@Autowired
	public CandidatesController(CandidatesService candidatesService) {
		super();
		this.candidatesService = candidatesService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Candidates>> getAll(){
		return this.candidatesService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Candidates candidates) {
		
		return this.candidatesService.add(candidates);
	
	}

}
