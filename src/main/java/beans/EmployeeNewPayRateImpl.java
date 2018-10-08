package beans;

public class EmployeeNewPayRateImpl implements EmployeeNewPayRate{
	
	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void newPayRate(long employeeId, double rate) throws Exception {
		Employee employee = employeeDao.find(employeeId);
		employee.setPayRate(employee.getPayRate() * (1 + rate));
		employeeDao.update(employee);
	}
	
	public Employee getEmployee(long employeeId) {
		return employeeDao.find(employeeId);
	}

}
