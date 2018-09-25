package org.clm.service;

import org.clm.bean.Category;

import java.util.List;

/**
 * @author Ccc
 * @date 2018/9/25 0025 下午 6:23
 */
public interface CategoryService {
    Category FindOne(Integer id);

    List<Category> FindAllByKey(Category category);

    int insertc(Category category);
}