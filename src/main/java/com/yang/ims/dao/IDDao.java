package com.yang.ims.dao;

import com.yang.ims.model.ID;

/**
 * 身份证Dao
 */
public interface IDDao {
    /**
     * 通过身份证号码查询
     * @param id
     * @return
     */
    ID findByID(ID id);
}
