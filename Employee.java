package org.classtask6;

//From the below image, Create an implementation for a java class named Employee that represents an employee with attributes including ID, name, and salary. 
//The class includes a method called raiseSalary(percent), 
//which updates the salary by a specified percentage

public class Employee {
	private int id;
	private int salary;
	private String firstName;
	private String secondName;
	public Employee(int id,String firstName,String secondName,int salary) {
		this.id=id;
		this.firstName=firstName;
		this.secondName=secondName;
		this.salary=salary;

	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return firstName +" "+secondName;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void raiseSalary(int per) {
		salary = salary+salary * per/100;
	}
	public int annualSalary() {
		return salary*12;
	}
	@Override
	public String toString() {
		return "Employee [id = "+id+",Name = "+firstName +" "+ secondName +", Salary ="+salary +"]";
	}
	public static void main(String[] args) {
		Employee e = new Employee(1, "John", "Doe", 5000);
		System.out.println(e);
		e.raiseSalary(10);
		System.out.println("After Raise : "+e);
	}
}
