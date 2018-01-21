package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.AlertMapper;
import com.example.demo.model.Alert;
import com.example.demo.pojo.AlertList;

@Service
public class AlertService {
	
	@Autowired
	AlertMapper alertMapper;
	
	public List<AlertList> list(int bid){
		List<AlertList> list = new ArrayList<>();
		try {
			list = alertMapper.selectAlertList(bid);
		} catch (Exception e) {
			System.err.println(e);
		}
		return list;
	}
	
	public int cancel(int id){
		int r = 0;
		Alert record = new Alert();
		record.setId(id);
		record.setState(0);
		try {
			r = alertMapper.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			System.err.println(e);
		}
		return r;
	}

}
