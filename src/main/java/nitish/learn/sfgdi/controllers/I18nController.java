package nitish.learn.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import nitish.learn.sfgdi.services.GreetingService;

@Controller
public class I18nController {

	private final GreetingService gs;

	public I18nController(@Qualifier("i18nService") GreetingService gs) {
		super();
		this.gs = gs;
	}

	public String sayHello() {
		return gs.sayGreeting();
	}
}
