package club.ak.work.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import club.ak.work.bean.ResponseResult;
import club.ak.work.bean.User;
import club.ak.work.service.IUserService;
import club.ak.work.service.exc.UserNotFoundException;
import club.ak.work.service.exc.UsernameNotFound;

@RequestMapping("/user")
@Controller
public class UserController extends BaseController{
	
	@Resource(name="userService")
	private IUserService userService;
	
	@RequestMapping(value="/handle_login.do",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult handleLogin(String username,String password,HttpSession session){
		ResponseResult result = null;
		try {
			User unveriUser = userService.login(username, password);
			//准备拿取数据
			session.setAttribute("uid", unveriUser.getId());
			session.setAttribute("username", unveriUser.getUsername());
			result = new ResponseResult(1,"登录成功");
		} catch (UserNotFoundException e) {
			result = new ResponseResult(-1,e.getMessage());
		}
		return result;
		
	}
}
