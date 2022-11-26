package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


//For OneToOne
@Entity
public class Student1 {
	
	@Id
	private int rollno;
	private String name;
	private int mark;
	
	@OneToOne
	private Laptop1 laptop;
	
	
	public Laptop1 getLaptop1() {
		return laptop;
	}
	public void setLaptop1(Laptop1 laptop) {
		this.laptop = laptop;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]";
	}
	
	

}
