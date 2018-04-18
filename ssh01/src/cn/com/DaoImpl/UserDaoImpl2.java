package cn.com.DaoImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.com.Dao.UserDao;
import cn.com.entity.UserTbl;

//底层使用sessionFaction，自动注入模板hibernateTemplate
public class UserDaoImpl2 extends HibernateDaoSupport implements UserDao{

	@Override
	public void save(UserTbl userTbl) {
		this.getHibernateTemplate().save(userTbl);
	}

	@Override
	public void update(UserTbl userTbl) {
		this.getHibernateTemplate().update(userTbl);
	}

	@Override
	public void delete(Serializable userid) {
		this.getHibernateTemplate().delete(findbyid(userid));
	}

	@Override
	public UserTbl findbyid(Serializable userid) {
		return this.getHibernateTemplate().get(UserTbl.class, userid);
	}

	@Override
	public List<UserTbl> findall() {
		return (List<UserTbl>) this.getHibernateTemplate().find("from UserTbl", null);
	}

}
