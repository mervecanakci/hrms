package hrms.hrms.core.adapters.concretes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import hrms.hrms.core.adapters.abstracts.CloudinaryService;

@Configuration
public class AppConfig {
	
	@Bean
    public Cloudinary cloudinaryUser(){
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dkgkmv13u",
                "api_key", "861856767761499",
                "api_secret", "bf92rcGwF866SMgL6ImoVvPqUQI"));
    }

    @Bean
    public CloudinaryService cloudinaryService(){
        return new CloudinaryManager(cloudinaryUser());
    }

}
