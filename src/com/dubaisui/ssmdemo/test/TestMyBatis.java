package com.dubaisui.ssmdemo.test;

import javax.annotation.Resource;

import org.junit.Test;

import com.dubaisui.ssmdemo.model.DemoUser;
import com.dubaisui.ssmdemo.service.IDemoUserService;


public class TestMyBatis {

	   	@Resource  
	    private IDemoUserService demoUserService = null;  
	  
	    @Test  
	    public void mytest() {  
	    	DemoUser user = demoUserService.selectById(3);  
	        System.out.println("查询结果："+user.getId());  
	    }  
}
