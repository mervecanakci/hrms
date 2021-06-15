package hrms.hrms;

//import java.io.File;
import java.io.IOException;
//import java.util.Map;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//import com.cloudinary.*;
//import com.cloudinary.utils.ObjectUtils;

@SpringBootApplication
@EnableSwagger2
public class HrmsApplication {

	public static void main(String[] args) throws IOException {
		
		SpringApplication.run(HrmsApplication.class, args);
		
//		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
//				"cloud_name", "defal1az2",
//				"api_key", "872453487958628",
//				"api_secret", "Cy_M_GwtxuTyw9_MCxYecOg1j3g"));
//		
//		File file = new File("my_image.jpg");
//		Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
//		System.out.println(uploadResult.get("url"));
	}

	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("hrms.hrms"))                         
          .build();                                           
    }
}
