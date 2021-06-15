package hrms.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image, Integer> {
	Image getByImageId(int imageId);
}
