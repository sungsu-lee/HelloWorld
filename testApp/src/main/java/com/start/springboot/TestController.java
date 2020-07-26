package com.start.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/")
	public String index() {
		//return "index23-modifyed by user1";
		return "etr1036";  //by dfsdf
	}
}
