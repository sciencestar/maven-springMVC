package com.service.impl;

import com.dao.IUserDao;
import com.entity.User;
import com.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/17
 * @Version V1.0
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public boolean doUserLogin(User user) {
        List<User> list = userDao.selectId(user.getUsername());
        if (list.size() == 0) {
            return false;
        } else {
            if (list.get(0).getPassword().equals(user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
}
