package nitish.learn.sfgdi.services;

public class GreetingServiceFactory {

	public GreetingService creatingGreeting(String lang) {

		switch (lang) {
		case "es":
			return new SpanishGreetingService();
		case "de":
			return new GermanGreetingService();
		case "en":
		default:
			return new EnglishGreetingService();
		}
	}
}
