package io.github.sonamvyas.basics;

public class Employee implements Comparable<Employee> {
	private Integer id;
	private String firstname;
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
		if (firstname == null) {
			throw new IllegalArgumentException();

		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Emplyee [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + "]";
	}

	/**
	 * to sort you have override compareTo, possible return values : -1 , 0, 1
	 * 
	 */
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
