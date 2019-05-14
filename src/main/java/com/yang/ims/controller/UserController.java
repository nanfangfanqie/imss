package com.yang.ims.controller;

import com.yang.ims.model.User;
import com.yang.ims.service.UserService;
import com.yang.ims.vo.MessageResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yangchen
 * on 2019/4/7 16:01
 */
@RestController
@SessionAttributes("veri")
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 登录
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public MessageResult login(User user){
        return userService.login(user);
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @RequestMapping("/register")
    public MessageResult register(User user){
        return userService.register(user);
    }

    
}
