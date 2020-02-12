package com.cts.springbootjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.springbootjpa.Person;
import com.cts.springbootjpa.dao.IPersonDao;

@Service
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private IPersonDao dao;//entity mgr factory
	
	@Override
	public List<Person> getAllPersons() {
	
		return dao.findAll();
				
	}

	@Override
	public Optional<Person> getPersonById(int id) {
		
		return dao.findById(id);
	}
	@Override
	public Person getPersonByName(String name) {
		
			return dao.findByPersonName(name);
	}
	@Override
	public Person findUsingNameAddr(String name,String addr){
		return dao.findUsingNameAddr(name,addr);
	}
	
	
}
