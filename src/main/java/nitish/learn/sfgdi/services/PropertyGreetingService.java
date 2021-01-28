package nitish.learn.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello property";
	}

}
