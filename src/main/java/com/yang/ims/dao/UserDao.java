package com.yang.ims.dao;

import com.yang.ims.model.User;

/**用户数据Dao
 * @author yangchen
 * on 2019/4/7 15:59
 */
public interface UserDao {
    /**
     * 查询一个用户
     * @param user
     * @return
     */
    User selectOne(User user);
}
