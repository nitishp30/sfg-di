package nitish.learn.sfgdi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import nitish.learn.sfgdi.examplebeans.FakeDataSource;
import nitish.learn.sfgdi.examplebeans.FakeJmsSource;

@Configuration
public class PropertyConfig {

	@Value("${guru.username}")
	private String user;

	@Value("${guru.password}")
	private String password;

	@Value("${guru.dburl}")
	private String url;

	@Value("${guru.jms.username}")
	private String jmsUser;

	@Value("${guru.jms.password}")
	private String jmsPassword;

	@Value("${guru.jms.dburl}")
	private String jmsUrl;

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource tmp = new FakeDataSource();
		tmp.setUser(user);
		tmp.setPassword(password);
		tmp.setUrl(url);
		return tmp;
	}

	@Bean
	public FakeJmsSource fakeJMSSource() {
		FakeJmsSource tmp = new FakeJmsSource();
		tmp.setUser(jmsUser);
		tmp.setPassword(jmsPassword);
		tmp.setUrl(jmsUrl);
		return tmp;
	}

//	@Bean
//	public static PropertySourcesPlaceholderConfigurer properties() {
//		PropertySourcesPlaceholderConfigurer p = new PropertySourcesPlaceholderConfigurer();
//		return p;
//	}

}
