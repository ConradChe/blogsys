package com.che.blogsys.mapper;

import com.che.blogsys.pojo.Blog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper {

    int addBlog(Blog blog);
}
