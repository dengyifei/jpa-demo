package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee {
	
	
	@Id
	@GenericGenerator(name = "PKUUID", strategy = "uuid2")
	@GeneratedValue(generator = "PKUUID") 
	@Column(length = 36)
	private String objID;
	private String name;
	private int age;
	
	
	@OneToMany(mappedBy = "employee") 
	private List<TelPhone> telPhones = new ArrayList<TelPhone>(); //一个人可能多个手机


	public String getObjID() {
		return objID;
	}


	public void setObjID(String objID) {
		this.objID = objID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public List<TelPhone> getTelPhones() {
		return telPhones;
	}


	public void setTelPhones(List<TelPhone> telPhones) {
		this.telPhones = telPhones;
	}
	
	
	
}
