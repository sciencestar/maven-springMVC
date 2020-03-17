package com.web.controller;

import com.entity.User;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName LoginController
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/17
 * @Version V1.0
 **/
@Controller
@RequestMapping("/test")
public class LoginController {
    @Autowired private IUserService userService; //基于接口的,用接口接收

    @RequestMapping("/login.action") //url
    public String dologin(User user, Model model) {
        if (userService.doUserLogin(user)) {
            System.out.println(user);
            model.addAttribute("successMsg", "登陆成功！");//返回到页面所夹带的参数
            model.addAttribute("name", user.getUsername());
            return "success";//返回的页面
        } else {
            model.addAttribute("failMsg", "用户不存在或密码错误！");
            return "fail";
        }
    }
}
