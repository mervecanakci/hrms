package hrms.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.UsersService;
import hrms.hrms.core.dataAcces.Users;
import hrms.hrms.core.entities.UserDao;
import hrms.hrms.core.utilies.result.DataResult;
import hrms.hrms.core.utilies.result.ErrorResult;
import hrms.hrms.core.utilies.result.Result;
import hrms.hrms.core.utilies.result.SuccessDataResult;
import hrms.hrms.core.utilies.result.SuccessResult;

@Service
public class UserManager  implements UsersService{
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<Users>> getAll() {
		return new SuccessDataResult<List<Users>>(this.userDao.findAll(),"Candidates listed..");
	}

	@Override
	public Result add(Users users) {
		if(users.getEmail().isEmpty()) {
			return new ErrorResult("Email doesn't add..");
		}
		this.userDao.save(users);
		return new SuccessResult("Email added..");
	}

}
