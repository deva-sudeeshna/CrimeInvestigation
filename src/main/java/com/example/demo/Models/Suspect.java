package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Suspect {

	@Id
	private String mobileno;
	private Integer caseid;
	private String name;
	private String address;
	private String relation;
	private String note;
	
	public Suspect() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Suspect(String mobileno, Integer caseid, String name, String address, String relation, String note) {
		super();
		this.mobileno = mobileno;
		this.caseid = caseid;
		this.name = name;
		this.address = address;
		this.relation = relation;
		this.note = note;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public Integer getCaseid() {
		return caseid;
	}

	public void setCaseid(Integer caseid) {
		this.caseid = caseid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Suspect [mobileno=" + mobileno + ", caseid=" + caseid + ", name=" + name + ", address=" + address
				+ ", relation=" + relation + ", note=" + note + "]";
	}
	
	
	
	
	
}
