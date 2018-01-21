package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.LocationMapper;
import com.example.demo.pojo.OlderLocation;

@Service
public class LocationService {
	
	@Autowired
	LocationMapper locationMapper;
	
	public List<OlderLocation> location(int uid){
		List<OlderLocation> list = new ArrayList<>();
		try {
			list = locationMapper.getLocation(uid);
		} catch (Exception e) {
			System.err.println(e);
		}
		return list;
	}
	
}
