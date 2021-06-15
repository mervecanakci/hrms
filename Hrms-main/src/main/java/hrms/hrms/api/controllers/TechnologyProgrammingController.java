package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.TechnologyProgrammingService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.TechnologyProgramming;

@RestController
@RequestMapping("/api/technologyProgramming")
public class TechnologyProgrammingController {
	
	private TechnologyProgrammingService technologyProgrammingService;
	
	@Autowired
	public TechnologyProgrammingController(TechnologyProgrammingService technologyProgrammingService) {
		super();
		this.technologyProgrammingService = technologyProgrammingService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody TechnologyProgramming technologyProgramming) {
		return this.technologyProgrammingService.add(technologyProgramming);
	}
	
	@GetMapping("/getall")
	public DataResult<List<TechnologyProgramming>> getAll(){
		return this.technologyProgrammingService.getAll();
	}

}
