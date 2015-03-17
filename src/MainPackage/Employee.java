package MainPackage;

public class Employee extends Person {
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public myDate getDateHired() {
		return dateHired;
	}
	public void setDateHired(myDate dateHired) {
		this.dateHired = dateHired;	
	}
	
	
	private String office;
	private double salary;
	private myDate dateHired;
	
	public Employee(){
		
	}
	
	public Employee(String name, String address, String phoneNumber, String email, String office, double salary, myDate dateHired)
	{
		
		
	}
	
	

}
