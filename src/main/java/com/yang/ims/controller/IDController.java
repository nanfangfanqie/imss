package com.yang.ims.controller;

import com.yang.ims.model.ID;
import com.yang.ims.service.IDService;
import com.yang.ims.vo.MessageResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/id")
public class IDController {

    @Resource
    private IDService idService;

    @RequestMapping("/verify")
    public MessageResult verify(ID id){
        return idService.verify(id);
    }

}
