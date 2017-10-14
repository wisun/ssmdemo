package com.dubaisui.ssmdemo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dubaisui.ssmdemo.dao.DemoUserMapper;
import com.dubaisui.ssmdemo.model.DemoUser;

@Service("DemoUserService")
public class DemoUserServiceImpl implements IDemoUserService {
	
	@Resource
	private DemoUserMapper demoUserDao;
	
	@Override
	public DemoUser selectById(Integer id) {
		// TODO Auto-generated method stub
		
		return this.demoUserDao.selectByPrimaryKey(id);
	}

	@Override
	public int insert(DemoUser record) {
		// TODO Auto-generated method stub
		return this.demoUserDao.insert(record);
	}

}
