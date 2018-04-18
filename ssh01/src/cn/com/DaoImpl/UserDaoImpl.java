package cn.com.DaoImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.com.Dao.UserDao;
import cn.com.entity.UserTbl;

public class UserDaoImpl implements UserDao{
	private HibernateTemplate hibernateTemplate;
	//spring为我们提供了hibernateTemplate对象类似于session对象之后又spring容器注入，所以提供setter方法
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(UserTbl userTbl) {
		this.hibernateTemplate.save(userTbl);
	}

	@Override
	public void update(UserTbl userTbl) {
		this.hibernateTemplate.update(userTbl);
	}

	@Override
	public void delete(Serializable userid) {
		this.hibernateTemplate.delete(findbyid(userid));
	}

	@Override
	public UserTbl findbyid(Serializable userid) {
		return this.hibernateTemplate.get(UserTbl.class, userid);
	}

	@Override
	public List<UserTbl> findall() {
		return (List<UserTbl>) this.hibernateTemplate.find("from UserTbl",null);
	}

}
