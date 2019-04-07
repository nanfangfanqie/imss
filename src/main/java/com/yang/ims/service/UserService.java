package com.yang.ims.service;

import com.yang.ims.model.User;
import com.yang.ims.vo.MessageResult;

/**用户服务接口
 * @author yangchen
 * on 2019/4/7 16:27
 */
public interface UserService {

    /**
     * 用户登录
     * @param user
     * @return
     */
    MessageResult login(User user);
}
