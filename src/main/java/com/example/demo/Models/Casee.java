package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Casee {

	@Id
	Integer caseid;
	String name;
	String type;
	String description;
	Integer officerid;
	String officername;

	
	public Casee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Casee(Integer caseid, String name, String type, String description, Integer officerid, String officername) {

		this.caseid = caseid;
		this.name = name;
		this.type = type;
		this.description = description;
		this.officerid = officerid;
		this.officername = officername;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getOfficerid() {
		return officerid;
	}
	public void setOfficerid(Integer officerid) {
		this.officerid = officerid;
	}
	public String getOfficername() {
		return officername;
	}
	public void setOfficername(String officername) {
		this.officername = officername;
	}
	@Override
	public String toString() {
		return "Case [caseid=" + caseid + ", name=" + name + ", type=" + type + ", description=" + description
				+ ", officerid=" + officerid + ", officername=" + officername + "]";
	}
	
	
}
