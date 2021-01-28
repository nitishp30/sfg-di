package nitish.learn.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import nitish.learn.sfgdi.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService gs;

	public MyController(GreetingService gs) {
		super();
		this.gs = gs;
	}

	public String sayHello() {
		return gs.sayGreeting();
	}
}
