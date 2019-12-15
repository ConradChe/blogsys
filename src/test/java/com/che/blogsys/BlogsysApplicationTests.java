package com.che.blogsys;

import com.che.blogsys.pojo.Category;
import com.che.blogsys.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BlogsysApplicationTests {
    @Autowired
    private CategoryService categoryService;

    //记录器
    Logger logger = LoggerFactory.getLogger(BlogsysApplicationTests.class);

    @Test
    void contextLoads() {
//        日志的级别
//        由低到高
//        可以调整日志的输出级别，日志就会在这个级别以后的更高级别生效
//        spring boot默认使用的是info级别
        logger.trace("trace日志");
        logger.debug("调试信息");
        logger.info("info信息");
        logger.warn("warn信息");
        logger.error("错误信息");
    }

    @Test
    void queryCategoryByNameTest(){
        Integer userId = 1;
        String name = "生活";
        Category category = new Category();
        category.setCategoryName(name);
        category.setUserId(userId);
        List<Category> categories = categoryService.queryCategoryByName(category);
        System.out.println(categories);
    }

}
