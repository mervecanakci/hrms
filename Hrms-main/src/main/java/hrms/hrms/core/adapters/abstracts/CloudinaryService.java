package hrms.hrms.core.adapters.abstracts;


import org.springframework.web.multipart.MultipartFile;

import hrms.hrms.core.utilies.result.DataResult;

public interface CloudinaryService {
	 
	 DataResult<?> save(MultipartFile file);
}
