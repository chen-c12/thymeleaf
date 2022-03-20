package com.chenddd.thymeleaf.Controller;

import com.chenddd.thymeleaf.Bean.Employee;
import com.chenddd.thymeleaf.Bean.User;
import com.chenddd.thymeleaf.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
/**
 * @author 金鱼
 * @title: loginController
 * @projectName thymeleaf
 * @description: 登录页controller
 * @date 2022/3/913:37
 */
@Controller
public class loginController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    EmployeeServiceImpl service;

    @ResponseBody
    @GetMapping("/emp")
    public Employee getEmployeeById(@RequestParam("id") Integer id){
        Employee employeeById = service.getEmployeeById(id);
        return employeeById;
    }

    @ResponseBody
    @GetMapping("/sql")
    public String query(){
        List<Long> longList = jdbcTemplate.queryForList("select count(*) from tbl_dept", Long.class);
        return longList.toString();
    }

    @GetMapping(value = {"/","/login"})
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session,Model model){
        if (StringUtils.hasLength(user.getUsername())&&StringUtils.hasLength(user.getPassword())){
            session.setAttribute("loginUser", user);
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg", "账号密码错误！");
            return "login";
        }

    }

    @GetMapping("/main.html")
    public String mainPage(){
            return "main";

    }
}
