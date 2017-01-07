package com.template.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Student")
public class Student {

	private long enrollmentId;
	
	private String name;
	
	private String lastname;
	
	public Student() { }
	
	public Student(long enrollmentId, String name, String lastname) {
		this.enrollmentId = enrollmentId;
		this.name = name;
		this.lastname = lastname;
	}

	public long getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(long enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Student [enrollmentId=" + enrollmentId + ", name=" + name + ", lastname=" + lastname + "]";
	}
	
}
