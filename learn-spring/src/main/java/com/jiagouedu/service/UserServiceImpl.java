package com.jiagouedu.service;

import com.jiagouedu.bean.Person;
import com.jiagouedu.bean.User;
import com.jiagouedu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @Author: Fox
 * @Date: 2019/3/31 20:03
 * @Version: 1.0
 */
@Component
public class UserServiceImpl implements UserService {

	//@Autowired
	UserDao userDao;

	/*public UserServiceImpl() {
		System.out.println("---constructer---");
	}*/

	//@Autowired
	public UserServiceImpl(UserDao userDao) {
		System.out.println("---constructer---"+userDao);
		this.userDao = userDao;
	}

	public UserServiceImpl(UserDao userDao, Person person) {
		System.out.println("---constructer---"+userDao+","+person);
		this.userDao = userDao;
	}
	public UserServiceImpl(UserDao userDao,User user) {
		System.out.println("---constructer---"+userDao+","+user);
		this.userDao = userDao;
	}
	//@Autowired
	public void setUserDaoxxxx(UserDao userDao){
		System.out.println("---setUserDaoxxxx---"+userDao);
		this.userDao = userDao;
	}

	public void setUserDao(UserDao userDao){
		System.out.println("---setUserDao---"+userDao);
		this.userDao = userDao;
	}

	public void setxxxxUserDao(UserDao userDao){
		System.out.println("---setxxxxxxUserDao---"+userDao);
		this.userDao = userDao;
	}


	@Override
	public void query() {
		System.out.println(userDao);
	}
}
