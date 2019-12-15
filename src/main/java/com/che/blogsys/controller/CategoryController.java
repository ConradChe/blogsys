package com.che.blogsys.controller;

import com.che.blogsys.bean.ApiResponse;
import com.che.blogsys.pojo.Category;
import com.che.blogsys.service.CategoryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: blogsys
 * @description: 博客Controller
 * @author: cgq
 * @create: 2019-12-14 11:41
 **/
@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @ResponseBody
    @GetMapping("/queryCategoryList")
    public ApiResponse queryCategoryList(){
        ApiResponse apiResponse = new ApiResponse(200, "success");
        Integer userId = 1;
        List<Category> categories = categoryService.queryCategoryList(userId);
        apiResponse.setData(categories);
        return apiResponse;
    }

    @ResponseBody
    @PostMapping("/queryCategoryList")
    public int queryCategoryByName(@Param("name") String name){
        Integer userId = 1;
        Category category = new Category();
        category.setCategoryName(name);
        category.setUserId(userId);
        List<Category> categories = categoryService.queryCategoryByName(category);
        int size = categories.size();
        return size;
    }
}