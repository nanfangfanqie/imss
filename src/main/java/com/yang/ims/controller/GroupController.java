package com.yang.ims.controller;

import com.yang.ims.model.FriendInfo;
import com.yang.ims.service.GroupService;
import com.yang.ims.vo.MessageResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {
    @Resource
    private GroupService groupService;


    @RequestMapping("/list")
    public MessageResult list(@RequestBody List<FriendInfo> list){
        if (list.isEmpty()){
            return new MessageResult(false);
        }else{
            return groupService.list(list);
        }
    }

    @RequestMapping("/update")
    public MessageResult update(@RequestBody List<FriendInfo> list){
        return groupService.update(list);
    }
}
