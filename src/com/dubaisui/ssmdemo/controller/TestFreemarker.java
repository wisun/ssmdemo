package com.dubaisui.ssmdemo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dubaisui.ssmdemo.service.IDemoUserService;


@Controller
@RequestMapping(value = "/freemarker")
public class TestFreemarker {
	
    @Resource  
    private IDemoUserService demoUserService;  
    
	@RequestMapping(value = "/demo001")
	@ResponseBody
	public ModelAndView testFreemarker(@RequestParam(value = "a", required = false) String a) throws Exception {
		//测试调用  url : http://localhost:8080/ssmdemo/freemarker/demo001?a=1
		
		ModelAndView mv = new ModelAndView();

		Map<String , String> user = new HashMap<String , String>();
		user.put("id", "1");
		user.put("name", "Zhang San");
		user.put("email", "abc@163.com");
		
		List<String> list = new ArrayList<String>();
		list.add("Jack1");
		list.add("Jack2");
		list.add("Jack3");

		mv.addObject("list", list);
		mv.addObject("user", user);
		mv.addObject("param", new String(a.getBytes("iso8859-1"), "utf-8"));
		mv.setViewName("fmtest");
		return mv;
	}
}
