public class Employee {
	//pojo class
	private int empNo;
	private String eName;
	private String Company;
    private int salary;	
	public Employee(int empNo, String eName, String company, int salary) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		Company = company;
		this.salary = salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", Company=" + Company + ", salary=" + salary + "]";
	}
	
	
}