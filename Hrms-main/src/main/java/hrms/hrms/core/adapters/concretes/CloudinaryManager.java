package hrms.hrms.core.adapters.concretes;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import hrms.hrms.core.adapters.abstracts.CloudinaryService;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.ErrorDataResult;
import hrms.hrms.core.utilies.result.SuccessDataResult;

@Service
public class CloudinaryManager implements CloudinaryService{
	
	
	private Cloudinary cloudinary;
	
	@Autowired
    public CloudinaryManager(Cloudinary cloudinary) {
        this.cloudinary = cloudinary;
    }


    @SuppressWarnings("rawtypes")
    @Override
    public DataResult<?> save(MultipartFile file) {
         try{
                Map cloudinaryUploader = cloudinary.uploader()
                        .upload(file.getBytes()
                ,ObjectUtils.emptyMap());
                return new SuccessDataResult<Map>(cloudinaryUploader);
            } 

         catch (IOException e){
               e.printStackTrace();
            }
            return new ErrorDataResult<Map>();
    }
	
}
