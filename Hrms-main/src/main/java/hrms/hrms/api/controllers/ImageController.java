package hrms.hrms.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import hrms.hrms.business.abstracts.CurriculumVitaeService;
import hrms.hrms.business.abstracts.ImageService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.CurriculumVitae;
import hrms.hrms.entities.concretes.Image;

@RestController
@RequestMapping("/api/images")
public class ImageController {
	
	private ImageService imageService;
	private CurriculumVitaeService curriculumVitaeService;

	@Autowired
	public ImageController(ImageService imageService,CurriculumVitaeService curriculumVitaeService) {
		super();
		this.imageService = imageService;
		this.curriculumVitaeService = curriculumVitaeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Image>> getAll() {
		return this.imageService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestParam(value = "cvId") int id, @RequestParam(value = "imageFile") MultipartFile imageFile) {
		
		CurriculumVitae curriculumVitae = this.curriculumVitaeService.getByCvId(id).getData();
		
		Image image = new Image();
		image.setCurriculumVitaeImage(curriculumVitae);
		
		return this.imageService.add(image,imageFile);
	}
	
}
