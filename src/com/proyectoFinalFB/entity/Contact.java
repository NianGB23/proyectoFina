package com.proyectoFinalFB.entity;

public class Contact {

	private String id;
	private String name;
	private String phone;
	private String address;
	private String birthdate;
	private String email;
	private String profession;
	private int basicSalary;
	private String workdays;
	
	
	
	
	
	public Contact(String id, String name, String phone, String direction, String birthdate, String email,
			String profession, int basicSalary, String workdays) {
		
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = direction;
		this.birthdate = birthdate;
		this.email = email;
		this.profession = profession;
		this.basicSalary = basicSalary;
		this.workdays = workdays;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public String getWorkdays() {
		return workdays;
	}
	public void setWorkdays(String workdays) {
		this.workdays = workdays;
	}
	

	
}
