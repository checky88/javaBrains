package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//by default every method is GET method
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Just changing this for new branch...";
	}

}
