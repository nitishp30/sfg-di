package nitish.learn.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import nitish.learn.sfgdi.examplebeans.FakeDataSource;
import nitish.learn.sfgdi.examplebeans.FakeJmsSource;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		FakeDataSource fd = ctx.getBean(FakeDataSource.class);
		System.out.println(fd.getUser());

		FakeJmsSource fm = ctx.getBean(FakeJmsSource.class);
		System.out.println(fm.getUser());
	}

}
