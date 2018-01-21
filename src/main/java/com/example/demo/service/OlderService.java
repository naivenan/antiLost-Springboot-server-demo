package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.model.UserExample;

@Service
public class OlderService {
	
	@Autowired
	UserMapper userMapper;
	
	public List<User> list(int uid){
		List<User> list = new ArrayList<>();
		try {
			UserExample example = new UserExample();
			example.createCriteria().andBidEqualTo(uid);
			list = userMapper.selectByExample(example);
		} catch (Exception e) {
			System.err.println(e);
		}
		return list;
	}
	
	public int add(int uid,String user){
		int r = 0;
		try {
			User record = new User();
			record.setBid(uid);
			UserExample example = new UserExample();
			example.createCriteria().andUserEqualTo(user);
			r = userMapper.updateByExampleSelective(record, example);
		} catch (Exception e) {
			System.err.println(e);
		}
		return r;
	}
	
	public List<Integer> delete(List<User> list){
		List<Integer> r = new ArrayList<>();
		try {
			User older = null;
			for(int i=0;i<list.size();i++){
				older = list.get(i);
				older.setBid(null);
				r.add(userMapper.updateByPrimaryKey(older));
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return r;
	}
}
