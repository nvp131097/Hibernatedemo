package com.hibernate;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	
	
	@Id
	private int eid;
	private String ename;
	
	@OneToMany(mappedBy = "employee" , fetch = FetchType.EAGER)
	private Collection<Computer> computer = new ArrayList<Computer>();
	
	
	public Collection<Computer> getComputer() {
		return computer;
	}
	public void setComputer(Collection<Computer> computer) {
		this.computer = computer;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	

}
