package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Home;
import com.example.demo.service.HomeServiceImpl;

@RestController
public class HomeController {

	@Autowired
	private HomeServiceImpl sh;
	
	@RequestMapping("/homedata")
	public Home Hello(@RequestParam("name") String name){
	   Home s = sh.fetchinfo(name);
	   
	   System.out.println("sss"+s);
		return s;
	}
	
	
}
