package com.che.blogsys.controller;

import com.che.blogsys.pojo.Blog;
import com.che.blogsys.pojo.Category;
import com.che.blogsys.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: blogsys
 * @description: 博客controller
 * @author: cgq
 * @create: 2019-12-13 19:37
 **/
@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping("/addBlog")
    public String addBlog(Blog blog, Category category){


        int i = blogService.addBlog(blog,category);
        if ( i > 0){
            return "success";
        }else {
            return "fail";
        }

    }
}