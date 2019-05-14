package com.yang.ims.service;

import com.yang.ims.model.FriendInfo;
import com.yang.ims.vo.MessageResult;

import java.util.List;

public interface GroupService {
    MessageResult list(List<FriendInfo> list);

    MessageResult update(List<FriendInfo> list);
}
