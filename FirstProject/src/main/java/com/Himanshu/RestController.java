package com.Himanshu;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping(path="/")
	public Request hello(){
		return new Request("123");
	}
}
