package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;


//For OneToOne
@Entity
public class Laptop1 {
	
	@Id
	private int lid;
	private String lname;
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	

}
