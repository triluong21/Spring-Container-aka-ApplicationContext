package beans;

import java.util.List;

public interface EmployeeDao {

	public void insert(Employee employee);
	public void update(Employee employee);
	public void update(List<Employee> employees);
	public void delete(long employeeId);
	public Employee find(long employeeId);
	public List<Employee> find(List<Long> employeeIds);
	public List<Employee> find(String employeename);
	public List<Employee> find(boolean locked);
}
