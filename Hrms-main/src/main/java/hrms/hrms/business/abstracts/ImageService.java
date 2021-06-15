package hrms.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.entities.concretes.Image;

public interface ImageService {

	DataResult<List<Image>> getAll();
	
	Result add(Image image, MultipartFile imageFile);
	
	DataResult<Image> getByImageId(int imageId);
}
