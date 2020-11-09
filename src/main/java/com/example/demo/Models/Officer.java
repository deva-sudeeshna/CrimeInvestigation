package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Officer {

	@Id
	Integer officerid;
	String officername;
	String mobileno;
	String address;
	
	String mail;
	String area;
	public Officer(Integer officerid, String officername, String mobileno, String address, String mail, String area) {
		super();
		this.officerid = officerid;
		this.officername = officername;
		this.mobileno = mobileno;
		this.address = address;
		this.mail = mail;
		this.area = area;
	}
	public Officer() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
	
}
