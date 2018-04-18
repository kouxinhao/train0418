package cn.com.Dao;

import java.io.Serializable;
import java.util.List;

import cn.com.entity.UserTbl;

public interface UserDao {
	public void save(UserTbl userTbl);
	public void update(UserTbl userTbl);
	public void delete(Serializable userid);
	public UserTbl findbyid(Serializable userid);
	public List<UserTbl> findall();
}
