package club.ak.work.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import club.ak.work.bean.User;
import club.ak.work.mapper.UserMapper;
import club.ak.work.service.exc.UserNotFoundException;

@Service("userService")
public class UserServiceImpl implements IUserService{
	
	@Resource(name="userMapper")
	private UserMapper userMapper;

	public User login(String username, String password) {
		User u = userMapper.login(username, password);
		if(u==null) {
			throw new UserNotFoundException("未发现用户或用户名错误，请联系管理员确认"); 
		}else {
			System.out.println("登录成功");
			return u;
		}
	}

	public Integer register(User user) {
		return null;
	}

}
