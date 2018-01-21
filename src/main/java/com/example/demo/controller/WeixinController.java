package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
import com.example.demo.util.HttpRequest;
import com.example.demo.util.StatusCode;

@RestController
@RequestMapping("/weixin")
public class WeixinController {
	
	private final static String code2sessionURL = "https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code";
	private final static String APPID = "wxf8be4e208378eef1";
	private final static String SECRET = "88cd603a71e7d09d1233378e68a8cfab";
	
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/code2session")
	Map<String, Object> register(String code){
		Map<String, Object> result = new HashMap<>();
		String url = code2sessionURL;
		url = url.replace("APPID", APPID);
		url = url.replace("SECRET", SECRET);
		url = url.replace("JSCODE", code);
		String data = HttpRequest.sendGet(url, "");
		result.put("data", data);
		result.put("code", StatusCode.SUCCESS_CODE);
		return result;
	}
	
}
