package nitish.learn.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import nitish.learn.sfgdi.services.GreetingService;
import nitish.learn.sfgdi.services.GreetingServiceFactory;

@Configuration
public class GreetingSreviceConfig {

	@Bean
	public GreetingServiceFactory getFactory() {
		return new GreetingServiceFactory();
	}

	@Bean
	@Primary
	@Profile({ "default", "en" })
	public GreetingService englishService(GreetingServiceFactory factory) {
		return factory.creatingGreeting("en");
	}

	@Bean
	@Primary
	@Profile("es")
	public GreetingService spanishService(GreetingServiceFactory factory) {
		return factory.creatingGreeting("es");
	}

	@Bean
	@Primary
	@Profile("de")
	public GreetingService germanService(GreetingServiceFactory factory) {
		return factory.creatingGreeting("de");
	}
}
