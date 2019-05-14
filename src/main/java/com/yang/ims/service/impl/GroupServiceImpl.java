package com.yang.ims.service.impl;

import com.yang.ims.dao.GroupDao;
import com.yang.ims.model.FriendInfo;
import com.yang.ims.service.GroupService;
import com.yang.ims.vo.MessageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yangchen
 * on 2019/4/7 16:28
 */
@Service
public class GroupServiceImpl implements GroupService {
    @Resource
    private GroupDao groupDao;


    @Override
    public MessageResult list(List<FriendInfo> list) {
        for (int i= 0;i<list.size();i++){
            FriendInfo info  = list.get(i);
            FriendInfo data = groupDao.selectOne(info);
            if (data == null){
                groupDao.insert(info);
            }else {
                if (info.getIndex() >= 0 && info.getIndex()!=data.getIndex()){
                    groupDao.update(info);
                }
                list.set(i,data);
            }
        }

        return new MessageResult(true,list);
    }

    @Override
    public MessageResult update(List<FriendInfo> list) {
        for (int i = 0;i<list.size();i++){
            groupDao.update(list.get(i));
        }
        return new MessageResult(true,list);
    }


}
