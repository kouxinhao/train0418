package cn.com.service;

import java.util.List;

import cn.com.Dao.UserDao;
import cn.com.entity.UserTbl;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public void addUser(UserTbl userTbl) {
		this.userDao.save(userTbl);
	}
	@Override
	public List<UserTbl> finduser() {
		return this.userDao.findall();
	}

}
