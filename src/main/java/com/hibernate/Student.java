package com.hibernate;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Student {
	
	@Id
	private int rollno;
	private String name;
	private int mark;
	
//	@OneToOne
//	private Laptop laptop;
	
	//mappedBy for not create new table student_laptp
//	@OneToMany(mappedBy="student")
//	private List<Laptop> laptop= new ArrayList<>();
	
	@ManyToMany(mappedBy = "student")
	private List<Laptop> laptop= new ArrayList<>();
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
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
		return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]";
	}
	
	

}
