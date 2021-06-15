package hrms.hrms.api.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.CurriculumVitaeService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.CurriculumVitae;

@RestController
@RequestMapping("/api/curriculumVitaeController")
public class CurriculumVitaeController {
	
	private CurriculumVitaeService curriculumVitaeService;

	@Autowired
	public CurriculumVitaeController(CurriculumVitaeService curriculumVitaeService) {
		super();
		this.curriculumVitaeService = curriculumVitaeService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CurriculumVitae curriculumVitae) {
		
		return this.curriculumVitaeService.add(curriculumVitae);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<CurriculumVitae>> getAll(){
		
		return this.curriculumVitaeService.getAll();
		
	}
	
	@GetMapping("getByCvId")
	public DataResult<CurriculumVitae> getByCvId(@RequestParam int cvId){

	        return this.curriculumVitaeService.getByCvId(cvId);
	}
}
