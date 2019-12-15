package com.che.blogsys.pojo;

/**
 * @program: blogsys
 * @description: 分类实体类
 * @author: cgq
 * @create: 2019-12-14 11:25
 **/
public class Category {
    private String categoryId;
    private String categoryName;
    private Integer userId;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", userId=" + userId +
                '}';
    }
}