package com.testyantra.dtos;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="employee_id")
	private int employeeId;
	@Column(name="employee_name")
	private String employeeName;
	
	//given on top of a variable which is not a collection, takes only one record at a time
	@Embedded
	private Address address;

	public Employee(int employeeId, String employeeName, Address address) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
	}

	public Employee() {
		
	}

	public int getStudentId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", address=" + address + "]";
	}

	
	
	
}
