package org.clm.service.impl;

import org.clm.Dao.CategoryMapper;
import org.clm.bean.Category;
import org.clm.service.CategoryService;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Ccc
 * @date 2018/9/25 0025 下午 6:27
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Category FindOne(Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Category> FindAllByKey(Category category) {
        return  categoryMapper.selectByKey(category);
    }

    @Override
    public int insertc(Category category) {
        int i = categoryMapper.insertSelective(category);
        return i;
    }
}
