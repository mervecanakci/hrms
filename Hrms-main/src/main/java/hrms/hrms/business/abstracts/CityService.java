package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.entities.concretes.City;

public interface CityService {
	DataResult<List<City>> getAll();
}
