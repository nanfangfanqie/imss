package com.yang.ims.service;

import com.yang.ims.model.ID;
import com.yang.ims.vo.MessageResult;

public interface IDService {
    /**
     * 身份证验证
     * @param id
     * @return
     */
    MessageResult verify(ID id);
}
