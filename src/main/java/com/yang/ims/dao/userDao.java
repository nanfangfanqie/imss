package com.yang.ims.dao;

import com.yang.ims.model.User;

import java.util.List;

/**用户数据Dao
 * @author yangchen
 * on 2019/4/7 15:59
 */
public interface userDao {
    /**
     * 查询一个用户
     * @param user
     * @return
     */
    User selectOne(User user);

    /**
     * 插入用户
     * @param user
     * @return
     */
    int insertOne(User user);

    List<User> selectAll(User user);
}
