package club.ak.work.service;

import club.ak.work.bean.User;

public interface IUserService {
	
	/**
	 * 处理登录业务
	 * @param username
	 * @param password
	 * @return
	 */
	User login(String username,String password);
	
	/**
	 * 注册新用户
	 * @param user
	 * @return
	 */
	Integer register(User user);
}
