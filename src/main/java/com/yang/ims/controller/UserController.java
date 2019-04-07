package com.yang.ims.controller;

import com.yang.ims.model.User;
import com.yang.ims.service.UserService;
import com.yang.ims.vo.MessageResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author yangchen
 * on 2019/4/7 16:01
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 点击VCS
     */
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody

    public String login(){
        User user = new User();
        user.setTelphone("18860957075");
        return userService.login(user).toString();
    }


}
