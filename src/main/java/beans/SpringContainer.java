package beans;

import	org.springframework.context.annotation.AnnotationConfigApplicationContext;
import	org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext	applicationContext	=	new	AnnotationConfigApplicationContext(BeanConfiguration.class);
		EmployeeNewPayRate	employeeNewPayRate	=	applicationContext.getBean("employeeNewPayRate", EmployeeNewPayRate.class);
		
		
		
		System.out.println("PRIOR NEW PAY RATE APPLIED");
		System.out.println(" EmplID      Name      PayRate   ");
		System.out.println(" ======  ===========  ===========");
		System.out.println("    " + employeeNewPayRate.getEmployee(1).getId() + "    " + employeeNewPayRate.getEmployee(1).getEmployeeName() +"     " +  employeeNewPayRate.getEmployee(1).getPayRate());
		System.out.println("    " + employeeNewPayRate.getEmployee(2).getId() + "    " + employeeNewPayRate.getEmployee(2).getEmployeeName() +"     " +  employeeNewPayRate.getEmployee(2).getPayRate());
		System.out.println("    " + employeeNewPayRate.getEmployee(3).getId() + "    " + employeeNewPayRate.getEmployee(3).getEmployeeName() +"     " +  employeeNewPayRate.getEmployee(3).getPayRate());
		System.out.println("    " + employeeNewPayRate.getEmployee(4).getId() + "    " + employeeNewPayRate.getEmployee(4).getEmployeeName() +"     " +  employeeNewPayRate.getEmployee(4).getPayRate());
		employeeNewPayRate.newPayRate(1, 0.03);
		employeeNewPayRate.newPayRate(2, 0.03);
		employeeNewPayRate.newPayRate(3, 0.03);
		employeeNewPayRate.newPayRate(4, 0.03);
		System.out.println(" ");
		System.out.println("AFTER NEW PAY RATE APPLIED");
		System.out.println(" EmplID      Name      PayRate   ");
		System.out.println(" ======  ===========  ===========");
		System.out.println("    " + employeeNewPayRate.getEmployee(1).getId() + "    " + employeeNewPayRate.getEmployee(1).getEmployeeName() +"     " +  employeeNewPayRate.getEmployee(1).getPayRate());
		System.out.println("    " + employeeNewPayRate.getEmployee(2).getId() + "    " + employeeNewPayRate.getEmployee(2).getEmployeeName() +"     " +  employeeNewPayRate.getEmployee(2).getPayRate());
		System.out.println("    " + employeeNewPayRate.getEmployee(3).getId() + "    " + employeeNewPayRate.getEmployee(3).getEmployeeName() +"     " +  employeeNewPayRate.getEmployee(3).getPayRate());
		System.out.println("    " + employeeNewPayRate.getEmployee(4).getId() + "    " + employeeNewPayRate.getEmployee(4).getEmployeeName() +"     " +  employeeNewPayRate.getEmployee(4).getPayRate());

	}

}
