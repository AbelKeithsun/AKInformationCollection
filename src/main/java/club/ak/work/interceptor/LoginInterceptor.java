package club.ak.work.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		//日志
		System.out.println("LoginInterceptor.preHandle()");
		System.out.println("\trequest:"+request);
		System.out.println("\tresponse:"+response);
		System.out.println("\tObject:"+handler);
		
		//获取 HttpSession 对象
		HttpSession session = request.getSession();
		System.out.println("\tObject:"+session.getAttribute("uid"));
		
		//判断是否已登录
		if(session.getAttribute("uid")==null) {
			//确定重定向的页面：主页
			String url = request.getContextPath()+"/main/login.do";
			//没有登录，则重定向到主页
			response.sendRedirect(url);
			//拦截
			return false;
		}
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//日志
		System.out.println("LoginInterceptor.preHandle()");
		System.out.println("\trequest:"+request);
		System.out.println("\tresponse:"+response);
		System.out.println("\tObject:"+handler);		
		System.out.println("\tModelAndView:"+modelAndView);
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//日志
		System.out.println("LoginInterceptor.preHandle()");
		System.out.println("\trequest:"+request);
		System.out.println("\tresponse:"+response);
		System.out.println("\tObject:"+handler);
		System.out.println("\tException:"+ex);
	}

}
