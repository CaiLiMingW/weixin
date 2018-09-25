package org.clm.Dao;

import org.clm.bean.SellInfo;

public interface SellInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SellInfo record);

    int insertSelective(SellInfo record);

    SellInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SellInfo record);

    int updateByPrimaryKey(SellInfo record);
}