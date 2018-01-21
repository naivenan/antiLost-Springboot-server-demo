package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.model.UserExample;
import com.example.demo.util.StatusCode;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;

	public Map<String, Object> register(User user) {
		Map<String, Object> map = new HashMap<>();
		try {
			userMapper.insert(user);
			map.put("state", StatusCode.SUCCESS);
			map.put("errMessage", null);
		} catch (Exception e) {
			System.err.println(e);
			map.put("state", StatusCode.FAILURE);
			map.put("errMessage", "duplicated user");
		}
		return map;
	}

	public Map<String, Object> login(String user, String password) {
		Map<String, Object> map = new HashMap<>();
		UserExample example = new UserExample();
		example.createCriteria().andUserEqualTo(user);
		List<User> list = userMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			User u = list.get(0);
			if (password.equals(u.getPassword())) {
				map.put("userinfo", u);
				map.put("errMessage", null);
			} else {
				map.put("userinfo", null);
				map.put("errMessage", "password not correct");
			}
		} else {
			map.put("userinfo", null);
			map.put("errMessage", "user not exist");
		}
		return map;
	}

	public Map<String, Object> wxlogin(User user) {
		Map<String, Object> map = new HashMap<>();
		UserExample example = new UserExample();
		example.createCriteria().andUserEqualTo(user.getUser());
		List<User> list = userMapper.selectByExample(example);
		User u = null;
		if (list != null && list.size() > 0) {
			u = list.get(0);
		} else {
			int id = userMapper.insert(user);
			u = userMapper.selectByPrimaryKey(id);
		}
		map.put("userinfo", u);
		map.put("errMessage", null);
		return map;
	}

	public int update(User user) {
		int r = 0;
		try {
			r = userMapper.updateByPrimaryKeySelective(user);
		} catch (Exception e) {
			System.err.println(e);
		}
		return r;
	}
}
