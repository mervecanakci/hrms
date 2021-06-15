package hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "image_cv")
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="image_id")
	private int imageId;
	
	@Column(name="image_url")
	private String image_url;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private CurriculumVitae curriculumVitaeImage;

	public Image() {
		super();
	}

	public Image(int imageId, String image_url, CurriculumVitae curriculumVitaeImage) {
		super();
		this.imageId = imageId;
		this.image_url = image_url;
		this.curriculumVitaeImage = curriculumVitaeImage;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public CurriculumVitae getCurriculumVitaeImage() {
		return curriculumVitaeImage;
	}

	public void setCurriculumVitaeImage(CurriculumVitae curriculumVitaeImage) {
		this.curriculumVitaeImage = curriculumVitaeImage;
	}
	
	
	
}
