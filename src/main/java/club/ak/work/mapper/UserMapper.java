package club.ak.work.mapper;


import org.apache.ibatis.annotations.Param;

import club.ak.work.bean.User;

public interface UserMapper {

	/**
	 * 处理登录业务
	 * @param username
	 * @param password
	 * @return
	 */
	User login(@Param("username") String username,@Param("password") String password);
	
	/**
	 * 注册新用户
	 * @param user
	 * @return
	 */
	Integer register(User user);
	
    
}