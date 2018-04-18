package cn.com.service;

import java.util.List;

import cn.com.entity.UserTbl;

public interface UserService {
	public void addUser(UserTbl userTbl);
	public List<UserTbl> finduser();
}
