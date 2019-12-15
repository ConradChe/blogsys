package com.che.blogsys.mapper;

import com.che.blogsys.pojo.BlogCategory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogCategoryMapper {

    int addBlogCategory(BlogCategory blogCategory);
}
