package nitish.learn.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import nitish.learn.sfgdi.controllers.ConstructorInjectedController;
import nitish.learn.sfgdi.controllers.I18nController;
import nitish.learn.sfgdi.controllers.MyController;
import nitish.learn.sfgdi.controllers.PropretyInjectedController;
import nitish.learn.sfgdi.controllers.SetterInjectedController;
import nitish.learn.sfgdi.services.GreetingService;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18 = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18.sayHello());

		GreetingService sr = (GreetingService) ctx.getBean("i18nService");
		System.out.println(sr.sayGreeting());

		MyController ctr = (MyController) ctx.getBean("myController");
		System.out.println(ctr.sayHello());

		System.out.println("--- property ---");

		PropretyInjectedController pctr = (PropretyInjectedController) ctx.getBean("propretyInjectedController");
		System.out.println(pctr.sayGreeting());

		System.out.println("--- setter ---");
		SetterInjectedController sctr = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(sctr.sayGreeting());

		System.out.println("--- constructor ---");
		ConstructorInjectedController conctr = (ConstructorInjectedController) ctx
				.getBean("constructorInjectedController");
		System.out.println(conctr.sayGreeting());

	}

}
