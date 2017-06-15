package serviceimpl;

import dao.UserDao;
import entity.User;
import lombok.Setter;
import service.UserService;
/*
 * 用户服务实现类 实现对User功能的业务管理
 */
public class UserServciceImpl implements UserService {
		//声明接口引用  和具体实现类解耦合
	// 使用lombok生成dao属性的setter访问器，会被Spring调用，实现设置注入。
	@Setter
	private UserDao dao;
	
	
	@Override
	public void addNewUser(User user) {
		
			dao.save(user);
	}

}
