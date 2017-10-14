package com.dubaisui.ssmdemo.service;

import com.dubaisui.ssmdemo.model.DemoUser;

public interface IDemoUserService {
	public DemoUser selectById(Integer id);
	int insert(DemoUser record);
}
