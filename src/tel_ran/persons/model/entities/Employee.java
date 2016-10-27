package tel_ran.persons.model.entities;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Employee extends Person {
	String company;
	Integer salary;
	
	public Employee(){}
	
	public Employee(int id, String name, LocalDate birthYear, Address address, String company, Integer salary) {
		super(id, name, birthYear, address);
		this.company = company;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [company=" + company + ", salary=" + salary + ", id=" + id + ", name=" + name + ", birthYear="
				+ birthyear + ", address=" + address + "]";
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
}
