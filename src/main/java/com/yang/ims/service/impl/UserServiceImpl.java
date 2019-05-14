package com.yang.ims.service.impl;

import com.yang.ims.model.User;
import com.yang.ims.service.UserService;
import com.yang.ims.vo.MessageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.annotation.Resource;

/**
 * @author yangchen
 * on 2019/4/7 16:28
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    /**
     * 持有一个userDao
     */
    @Resource
    private com.yang.ims.dao.userDao userDao;

    @Override
    public MessageResult login(User user) {
//        User userFromDb = userDao.selectOne(user);
//        if (null!=userFromDb){
//            if (user.getPassword().equals(userFromDb.getPassword())){
//                return new MessageResult<>(true, userFromDb);
//            }else {
//                return new MessageResult<>(false, "密码错误");
//            }
//        }else {
//            return new MessageResult<>(false, "不存在的用户");
//        }
        return null;
    }

    @Override
    public MessageResult register(User user) {
        User userFromDb = userDao.selectOne(user);
        if(null!=userFromDb){
            return new MessageResult(false,"用户已经存在");
        }else {
            int count = userDao.insertOne(user);
            if (count ==1){
                return new MessageResult(true);
            }
        }
        return new MessageResult(false);
    }
}
