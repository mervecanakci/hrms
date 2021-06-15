package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.dataAcces.Users;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.Result;

public interface UsersService {
	
	DataResult<List<Users>> getAll();
	
	Result add(Users users);
}
