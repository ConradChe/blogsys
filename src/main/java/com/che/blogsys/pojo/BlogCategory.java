package com.che.blogsys.pojo;

/**
 * @program: blogsys
 * @description: 博客分类关系类
 * @author: cgq
 * @create: 2019-12-15 14:37
 **/
public class BlogCategory {
    private String blogId;
    private String categoryId;

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "BlogCategory{" +
                "blogId='" + blogId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                '}';
    }
}