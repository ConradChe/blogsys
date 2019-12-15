package com.che.blogsys.pojo;

/**
 * @program: blogsys
 * @description: 博客实体类
 * @author: cgq
 * @create: 2019-12-13 19:13
 **/
public class Blog {
    private String blogId;
    private Integer userId;
    private String title;
    private String content;
    private Integer isHide;
    private Integer likeNum;
    private Integer commentNum;
    private Integer status;
    private String operateTime;

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getIsHide() {
        return isHide;
    }

    public void setIsHide(Integer isHide) {
        this.isHide = isHide;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", isHide=" + isHide +
                ", likeNum=" + likeNum +
                ", commentNum=" + commentNum +
                ", status=" + status +
                '}';
    }
}