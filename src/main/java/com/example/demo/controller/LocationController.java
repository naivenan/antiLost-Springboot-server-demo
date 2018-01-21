package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.OlderLocation;
import com.example.demo.service.LocationService;
import com.example.demo.util.StatusCode;

@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	LocationService locationService;
	
	@RequestMapping
	Map<String, Object> location(int uid){
		Map<String, Object> result = new HashMap<>();
		List<OlderLocation> list = locationService.location(uid);
		result.put("data", list);
		result.put("code", StatusCode.SUCCESS_CODE);
		return result;
	}
	
}
