package com.yang.ims.dao;

import com.yang.ims.model.FriendInfo;

public interface GroupDao {

    FriendInfo selectOne(FriendInfo friendInfo);

    void insert(FriendInfo info);

    void update(FriendInfo friendInfo);
}
