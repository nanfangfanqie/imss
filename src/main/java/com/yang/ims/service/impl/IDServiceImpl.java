package com.yang.ims.service.impl;

import com.yang.ims.dao.IDDao;
import com.yang.ims.model.ID;
import com.yang.ims.service.IDService;
import com.yang.ims.vo.MessageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IDServiceImpl implements IDService {

    @Resource private IDDao idDao;
    @Override
    public MessageResult verify(ID id) {
        ID idFromDb;
        idFromDb = idDao.findByID(id);
        if (null!=idFromDb){
            if (id.getName().equals(idFromDb.getName())){
                return new MessageResult(true);
            }else{
                return new MessageResult(false,"姓名无法对应");
            }
        }else {
            return new MessageResult(false,"不存在的身份信息");
        }
    }
}
