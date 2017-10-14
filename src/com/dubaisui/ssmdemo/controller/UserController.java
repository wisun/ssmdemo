package com.dubaisui.ssmdemo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.dubaisui.ssmdemo.service.IDemoUserService;
import com.dubaisui.ssmdemo.model.DemoUser;


@Controller  
@RequestMapping("/user")
@EnableWebMvc
public class UserController {  
  
    @Resource  
    private IDemoUserService demoUserService;  

    
	//查询用户  
    //以页面绑定方式返回
    @RequestMapping("/list")  
    public String list(HttpServletRequest request,Model model){
    	//测试调用url: http://localhost:8080/ssmdemo/user/list?id=1
        int userId = Integer.parseInt(request.getParameter("id"));  
        DemoUser user = this.demoUserService.selectById(userId);  
        model.addAttribute("user", user);  
        return "user";  
    } 

    @ResponseBody  
    @RequestMapping(value="/list2", method=RequestMethod.GET)
    //以json方式返回
    public DemoUser list2(HttpServletRequest request){
    	//测试调用url: http://localhost:8080/ssmdemo/user/list2?id=1
        int userId = Integer.parseInt(request.getParameter("id"));  
        DemoUser user = this.demoUserService.selectById(userId);
        return user;
    }
    

    
}
