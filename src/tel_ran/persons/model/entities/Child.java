package tel_ran.persons.model.entities;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Child extends Person {

	String garten;
	
	public Child(){}
	
	public Child(int id, String name, LocalDate birthYear, Address address, String garten) {
		super(id, name, birthYear, address);
		this.garten = garten;
	}

	@Override
	public String toString() {
		return "Child [garten=" + garten + ", id=" + id + ", name=" + name + ", birthYear=" + birthyear + ", address="
				+ address + "]";
	}

	public String getGarten() {
		return garten;
	}

	public void setGarten(String garten) {
		this.garten = garten;
	}

	

}
