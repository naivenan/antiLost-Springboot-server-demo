package com.example.demo.controller;

import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.util.StatusCode;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/register")
	Map<String, Object> register(String user,String pswd,String tel){
		Map<String, Object> result = new HashMap<>();
		User record = new User();
		record.setUser(user);
		record.setPassword(pswd);
		record.setMphone(tel);
		record.setType("family");
		Map<String, Object> map = userService.register(record);
		result.put("data", map);
		result.put("code", StatusCode.SUCCESS_CODE);
		return result;
	}
	
	@RequestMapping("/login")
	Map<String, Object> login(String user,String pswd){
		Map<String, Object> result = new HashMap<>();
		Map<String, Object> data = userService.login(user, pswd);
		if(data.size()>0){
			if(data.get("userinfo")!=null){
				data.put("state",StatusCode.SUCCESS);
			}else {
				data.put("state",StatusCode.FAILURE);
			}
		}
		result.put("code", StatusCode.SUCCESS_CODE);
		result.put("data", data);
		return result;
	}
	
	@RequestMapping("/wxlogin")
	Map<String, Object> wxlogin(String user,String nickName,String sex,String imgUrl){
		Map<String, Object> result = new HashMap<>();
		User record = new User();
		record.setType("family");
		record.setUser(user);
		record.setName(nickName);
		record.setSex(sex);
		record.setImgUrl(imgUrl);
		Map<String, Object> data = userService.wxlogin(record);
		if(data.size()>0){
			if(data.get("userinfo")!=null){
				data.put("state",StatusCode.SUCCESS);
			}else {
				data.put("state",StatusCode.FAILURE);
			}
		}
		result.put("code", StatusCode.SUCCESS_CODE);
		result.put("data", data);
		return result;
	}
	
	@RequestMapping("/update")
	Map<String, Object> update(User record){
		Map<String, Object> result = new HashMap<>();
		int data = userService.update(record);
		result.put("code", StatusCode.SUCCESS_CODE);
		result.put("data", data);
		return result;
	}
}
