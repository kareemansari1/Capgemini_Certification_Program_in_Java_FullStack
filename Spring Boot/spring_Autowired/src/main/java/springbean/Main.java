package springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// Using ApplicationContext tom implement Spring IoC
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springbean/beans.xml");

		// Get the bean
		Sim sim = applicationContext.getBean("airtel", Sim.class);

		// Calling the methods
		sim.calling();
		sim.data();
	}
}
