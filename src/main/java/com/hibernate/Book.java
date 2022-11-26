package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	
	@Id
	private int Bid;
	private String Bname;
	
	@ManyToMany
	private List<Persons> persons = new ArrayList<Persons>();
	
	
	public List<Persons> getPersons() {
		return persons;
	}
	public void setPersons(List<Persons> persons) {
		this.persons = persons;
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	
	

}
