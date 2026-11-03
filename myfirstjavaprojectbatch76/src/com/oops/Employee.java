package com.oops;

//DTO : Data Transfer Object 
//POJO : Plain Old Java Object
public class Employee {

	private int eid;
	private String ename;
	private double sal;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}

	// no arg constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Employee(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	// setter & getters
	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getEid() {
		return eid;
	}

}
