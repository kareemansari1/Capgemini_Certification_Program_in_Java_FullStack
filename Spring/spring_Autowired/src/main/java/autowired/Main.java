package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowired/bean.xml");
		EmployeeService employeeService = applicationContext.getBean("employeeServiceConstructor",
				EmployeeService.class);
		System.out.println("Constructor " + employeeService.getEmployee().getName());
	}

}
