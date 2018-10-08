package beans;

import	org.springframework.context.annotation.Bean;
import	org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	@Bean
	public EmployeeDao employeeDao() {
		EmployeeDaoInMemoryImpl bean = new EmployeeDaoInMemoryImpl();
		return bean;
	}
	
	@Bean
	public EmployeeNewPayRate employeeNewPayRate() {
		EmployeeNewPayRateImpl bean = new EmployeeNewPayRateImpl();
		bean.setEmployeeDao(employeeDao());
		return bean;
	}

	
}
