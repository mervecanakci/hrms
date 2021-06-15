package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.ForeignLanguageService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.ForeignLanguage;

@RestController
@RequestMapping("/api/foreignlanguage")
public class ForeignLanguageController {
	
	private ForeignLanguageService foreignLanguageService;

	@Autowired
	public ForeignLanguageController(ForeignLanguageService foreignLanguageService) {
		super();
		this.foreignLanguageService = foreignLanguageService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ForeignLanguage foreignLanguage) {
		return this.foreignLanguageService.add(foreignLanguage);
	}

	@GetMapping("/getall")
	public DataResult<List<ForeignLanguage>> getAll(){
		return this.foreignLanguageService.getAll();
	}

}
