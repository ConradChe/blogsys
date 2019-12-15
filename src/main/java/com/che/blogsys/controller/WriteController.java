/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: WriteController
 * Author:   Che
 * Date:     2019/12/8 14:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.che.blogsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Che
 * @create 2019/12/8
 * @since 1.0.0
 */
@Controller
public class WriteController {

    @RequestMapping("/write")
    public String write(){
        return "write";
    }
}
