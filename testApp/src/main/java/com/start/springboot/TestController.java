package com.start.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/")
	//this is test sentense. by 0728 user2
	public String index() {
		//return "index23-modifyed by user1";
		//return "etr1036";  //by dfsdf
		//return "0728_modified";  //by dfsdf
		//return "00809_modified";  //by dfsdf
		//return "0823 modified by master";
		//return "08231928 modified by master";
		//return "08231957 modified by sub1";
		return "뭐라카노";  //by dfsdf
	}
}
