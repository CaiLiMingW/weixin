package org.clm.Dao;

import org.clm.bean.Detail;

public interface DetailMapper {
    int deleteByPrimaryKey(String detailId);

    int insert(Detail record);

    int insertSelective(Detail record);

    Detail selectByPrimaryKey(String detailId);

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKey(Detail record);
}