package nitish.learn.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nitish.learn.sfgdi.services.GreetingServiceImpl;

class PropretyInjectedControllerTest {

	PropretyInjectedController controller;

	@BeforeEach
	void setup() {
		controller = new PropretyInjectedController();
		controller.gs = new GreetingServiceImpl();
	}
	
	@Test
	void test() {
		System.out.println(controller.sayGreeting());
	}

}
