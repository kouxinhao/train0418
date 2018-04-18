package cn.com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.entity.UserTbl;
import cn.com.service.UserService;

public class UserAction extends ActionSupport{
	private UserTbl userTbl;//封装表单数据
	private UserService userService;//出入的service层的对象
	private List<UserTbl> userlist;
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserTbl getUserTbl() {
		return userTbl;
	}

	public void setUserTbl(UserTbl userTbl) {
		this.userTbl = userTbl;
	}

	public List<UserTbl> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<UserTbl> userlist) {
		this.userlist = userlist;
	}
	public String saveUser() {
		this.userService.addUser(userTbl);
		this.userlist = this.userService.finduser();
		return SUCCESS;
	}

}
