package hrms.hrms.entities.concretes;


import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity

@Table(name="city_job_adverts")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="city_id")
	private int cityId;
	
	@Column(name="city_name")
	private String cityName;
	
	@OneToMany(mappedBy = "cityJobAdverts")
	private List<JobAdverts> jobAdverts;

	public City() {
		super();
	}

	public City(int cityId, String cityName, List<JobAdverts> jobAdverts) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.jobAdverts = jobAdverts;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<JobAdverts> getJobAdverts() {
		return jobAdverts;
	}

	public void setJobAdverts(List<JobAdverts> jobAdverts) {
		this.jobAdverts = jobAdverts;
	}
	
	
}
