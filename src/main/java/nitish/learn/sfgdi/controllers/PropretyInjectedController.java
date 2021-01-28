package nitish.learn.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import nitish.learn.sfgdi.services.GreetingService;

@Controller
public class PropretyInjectedController {

	@Autowired
	@Qualifier("propertyGreetingService")
	public GreetingService gs;

	public String sayGreeting() {
		return gs.sayGreeting();
	}
}
