package com.chenddd.thymeleaf.Controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chenddd.thymeleaf.Bean.User;
import com.chenddd.thymeleaf.service.UserService;
import com.chenddd.thymeleaf.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * @author 金鱼
 * @title: TableController
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/109:59
 */
@Controller
public class TableController {

    @Autowired
    UserService userService;

    @GetMapping("/basic_table")
    public String basic_table(){
        return "table/basic_table";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteById(@PathVariable("id") Integer id,
                             @RequestParam("pn") Integer pn,
                             RedirectAttributes redirectAttributes) {
        userService.removeById(id);

        redirectAttributes.addAttribute("pn", pn);
        return "redirect: /dynamic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model){

        Page<User> userPage = new Page<>(pn,2);
        //分页查询结果
        Page<User> page = userService.page(userPage, null);

        model.addAttribute("page", page);

        return "table/dynamic_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }
}
