//Laptop-----model ,, price,processor,ram
//Bike-----
//College----
//School
//Car----

public class Student {
	//pojo class
	private int id;
	private String Name;
	private String department;
    private int year;
	public Student(int id, String name, String department, int year) {
		super();
		this.id = id;
		Name = name;
		this.department = department;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", department=" + department + ", year=" + year + "]";
	}
	
    	
    
	
	

}   
