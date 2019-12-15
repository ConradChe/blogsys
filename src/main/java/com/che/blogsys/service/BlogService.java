package com.che.blogsys.service;

import com.che.blogsys.mapper.BlogCategoryMapper;
import com.che.blogsys.mapper.BlogMapper;
import com.che.blogsys.mapper.CategoryMapper;
import com.che.blogsys.pojo.Blog;
import com.che.blogsys.pojo.BlogCategory;
import com.che.blogsys.pojo.Category;
import com.che.blogsys.util.CurrentUserUtil;
import com.che.blogsys.util.IdCreateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: blogsys
 * @description: 博客service
 * @author: cgq
 * @create: 2019-12-13 19:32
 **/
@Transactional(rollbackFor = Exception.class)
@Service
public class BlogService {
    @Autowired
    private BlogMapper blogMapper;
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private BlogCategoryMapper blogCategoryMapper;

    public int addBlog(Blog blog, Category category){
        String currentTime = CurrentUserUtil.getCurrentTime();
        String blogId = IdCreateUtil.getCode("B");
        Integer userId = 1;
        Integer status = 0;
        //添加博客信息
        blog.setBlogId(blogId);
        blog.setOperateTime(currentTime);
        blog.setUserId(userId);
        blog.setStatus(status);
        int i = blogMapper.addBlog(blog);

        //添加分类信息
        //判断是否为自定义分类,如果为自定义分类，向分类表插入分类信息
        String categoryId = category.getCategoryId();
        if (categoryId == null || categoryId.length() == 0){
            categoryId = IdCreateUtil.getCode("C");
            category.setUserId(userId);
            category.setCategoryId(categoryId);
            //添加分类信息
            categoryMapper.addCategory(category);
        }
        //添加博客分类关系信息
        BlogCategory blogCategory = new BlogCategory();
        blogCategory.setBlogId(blogId);
        blogCategory.setCategoryId(categoryId);
        blogCategoryMapper.addBlogCategory(blogCategory);

        return i;
    }
}