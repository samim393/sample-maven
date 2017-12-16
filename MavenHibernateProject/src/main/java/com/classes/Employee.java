package com.classes;

public class Employee {
	Integer eid;
	String ename;
	Integer esalary;
	String email;
	String edept;
	
	Employee()
	{
	}

	public Employee(Integer eid, String ename, Integer esalary, String email, String edept) {
		//super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.email = email;
		this.edept = edept;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEsalary() {
		return esalary;
	}

	public void setEsalary(Integer esalary) {
		this.esalary = esalary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", email=" + email + ", edept="
				+ edept + "]";
	}
	
	
	}


