package com.cts.springbootjpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer personId;
	private String personName;
	private String addr;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Person(Integer personId, String personName, String addr) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", addr=" + addr + "]";
	}
	
}
