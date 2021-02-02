package nitish.learn.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import nitish.learn.sfgdi.services.GreetingService;

@Controller
public class I18nController {

	private final GreetingService gs;

	public I18nController(GreetingService gs) {
		super();
		this.gs = gs;
	}

	public String sayHello() {
		return gs.sayGreeting();
	}
}
