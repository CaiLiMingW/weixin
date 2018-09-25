package org.clm.Dao;

import org.clm.bean.Category;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer categoryId);

    List<Category>  selectByKey(Category category);


    int updateByPrimaryKey(Category record);
}