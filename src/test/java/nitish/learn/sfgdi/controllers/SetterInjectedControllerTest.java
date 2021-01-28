package nitish.learn.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nitish.learn.sfgdi.services.GreetingServiceImpl;

class SetterInjectedControllerTest { 
	
	private SetterInjectedController controller;
	
	@BeforeEach
	void setup() {
		controller = new SetterInjectedController();
		controller.setGs(new GreetingServiceImpl());
	}

	@Test
	void test() {
		System.out.println(controller.sayGreeting());
	}

}
