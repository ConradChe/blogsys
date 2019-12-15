package com.che.blogsys.service;

import com.che.blogsys.mapper.CategoryMapper;
import com.che.blogsys.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: blogsys
 * @description: 分类Service
 * @author: cgq
 * @create: 2019-12-14 11:39
 **/
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoryList(Integer userId){

        return categoryMapper.queryCategoryList(userId);
    }

    public List<Category> queryCategoryByName(Category category){
        return categoryMapper.queryCategoryByName(category);
    }
}