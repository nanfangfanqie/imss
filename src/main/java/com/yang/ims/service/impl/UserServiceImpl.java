package com.yang.ims.service.impl;

import com.yang.ims.dao.UserDao;
import com.yang.ims.model.User;
import com.yang.ims.service.UserService;
import com.yang.ims.vo.MessageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yangchen
 * on 2019/4/7 16:28
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * 持有一个userDao
     */
    @Resource
    private UserDao userDao;

    @Override
    public MessageResult login(User user) {
        User userFromDb = userDao.selectOne(user);
        return new MessageResult(true,userFromDb);
    }
}
