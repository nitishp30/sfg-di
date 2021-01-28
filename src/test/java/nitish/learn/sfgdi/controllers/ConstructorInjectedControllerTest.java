package nitish.learn.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nitish.learn.sfgdi.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {
	private ConstructorInjectedController controller;

	@BeforeEach
	void setup() {
		controller = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	void test() {
		System.out.println(controller.sayGreeting());
	}

}
