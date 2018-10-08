package beans;

public class Employee {

	private long id;
	private String employeeName;
	private double payRate;
	private boolean locked;
	
	public Employee()
	{
		
	}
	
	public Employee(long id, String employeeName, double payRate) {
		this.id = id;
		this.employeeName = employeeName;
		this.payRate = payRate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
	
}
