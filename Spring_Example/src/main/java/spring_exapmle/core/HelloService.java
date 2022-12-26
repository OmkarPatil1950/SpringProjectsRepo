package spring_exapmle.core;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class HelloService implements Gretting{

	
	public HelloService() {
		System.out.println("Hello:no_arg");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "hello";
	}
	@Bean(name="srk")
	public static String welcome() {
		return "Virat";
	}

}
