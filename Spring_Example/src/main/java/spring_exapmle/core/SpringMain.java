package spring_exapmle.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		
		String filepath="./src/main/resources/spring-config-xml.xml";
		ApplicationContext ctx = new FileSystemXmlApplicationContext(filepath);
		
		Object obj=ctx.getBean("srk");
		
				
	}

}
