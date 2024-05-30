package com.tnsif.day1;

public class Student {
	
	//Data members
	private String name;
	private String usn;
	private int age;
	private String branch;
	private long mob;
	
	//Getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", usn=" + usn + ", age=" + age + ", branch=" + branch + ", mob=" + mob + "]";
	}
	
	
	

}
