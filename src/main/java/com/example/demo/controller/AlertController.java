package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.AlertList;
import com.example.demo.service.AlertService;
import com.example.demo.util.StatusCode;

@RestController
@RequestMapping("/alert")
public class AlertController {
	
	@Autowired
	AlertService alertService;
	
	@RequestMapping("/list")
	Map<String, Object> list(int bid){
		Map<String, Object> result = new HashMap<>();
		List<AlertList> list = alertService.list(bid);
		result.put("data", list);
		result.put("code", StatusCode.SUCCESS_CODE);
		return result;
	}
	
	@RequestMapping("/cancel")
	Map<String, Object> login(int id){
		Map<String, Object> result = new HashMap<>();
		int data = alertService.cancel(id);
		result.put("data", data);
		result.put("code", StatusCode.SUCCESS_CODE);
		return result;
	}
}
