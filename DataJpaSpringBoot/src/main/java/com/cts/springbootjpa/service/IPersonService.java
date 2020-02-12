package com.cts.springbootjpa.service;

import java.util.List;
import java.util.Optional;

import com.cts.springbootjpa.Person;


public interface IPersonService{

	public List<Person> getAllPersons();
	public Optional<Person> getPersonById(int id);
	public Person getPersonByName(String name) ;
	public Person findUsingNameAddr(String name,String addr);
	
}
