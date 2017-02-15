package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // maps the entire class as a Rest controller which tells spring that 
                // this is the class that deals with providing http response to http request
public class Controller {
	// this mapping tell spring that whenever there is a request to 
	// /hello just execute that method 
	// this way of mapping is for all http methods 
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi" ;
		
	}

}
