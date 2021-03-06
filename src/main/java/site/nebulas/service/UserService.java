package site.nebulas.service;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.nebulas.bean.User;
import site.nebulas.dao.UserDao;

/**
 * Created by Administrator on 2016/12/3.
 */
@Service
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(User user) throws HibernateException {
        System.out.println("UserService");
        userDao.saveUser(user);
    }


}
