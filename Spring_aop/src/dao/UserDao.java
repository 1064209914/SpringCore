package dao;

import entity.User;

//增加DAO接口 定义了持久划方法 
public interface UserDao {
  
	public void save(User user);
}
