package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Home;
import com.example.demo.repository.HomeRepository;

@Component
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	private HomeRepository rs;
	
	@Override
	public Home fetchinfo(String name){
		Home s = new Home(name);
         rs.save(s)	;	
		System.out.println("This is from service layer"+s);
		return s;
	}
	
	

}
