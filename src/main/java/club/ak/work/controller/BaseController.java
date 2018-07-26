package club.ak.work.controller;

import javax.servlet.http.HttpSession;

public abstract class BaseController {
	/**
	 * 从 session 中获取当前登录的用户的ID
	 * @param session
	 * @return 如果 Session 存在用户ID，则返回用户ID否则返回null
	 */
	protected Integer getUidFromSession(HttpSession session) {
		//从Session中获取当前登录的用户ID
		Object uidObject = session.getAttribute("uid");
		//判断 Session 是否为空
		if(uidObject == null) {
			return null;
		}else {
			return Integer.valueOf(uidObject.toString());
		}
	}
}
