package nitish.learn.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import nitish.learn.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {

	private GreetingService gs;

	public GreetingService getGs() {
		return gs;
	}

	@Autowired
	public void setGs(GreetingService gs) {
		this.gs = gs;
	}

	public String sayGreeting() {
		return gs.sayGreeting();
	}
}
