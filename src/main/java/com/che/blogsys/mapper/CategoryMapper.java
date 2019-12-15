package com.che.blogsys.mapper;

import com.che.blogsys.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    /*/**
    * @Description: 查询可被当前用户使用的所有分类
    * @Param: [userId]
    * @return: java.util.List<com.che.blogsys.pojo.Category>
    * @Author: cgq
    * @Date: 2019/12/14
    */
    List<Category> queryCategoryList(Integer userId);

    /*/**
    * @Description: 通过分类名称查询分类
    * @Param: [name]
    * @return: java.util.List<com.che.blogsys.pojo.Category>
    * @Author: cgq
    * @Date: 2019/12/14
    */
    List<Category> queryCategoryByName(Category category);

    int addCategory(Category category);
}
