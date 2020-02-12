package com.cts.springbootjpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.springbootjpa.service.IPersonService;

@RestController
public class MyRestController {
	
	@Autowired
	
	private IPersonService service;
	@RequestMapping("hi")
	
		public String getHi()
		{
			return "hi";
		}

	@RequestMapping("getAll")
	public List<Person> getAll(){
		
		return service.getAllPersons();
	}
	//A container object which may or may not contain a 
	//non-null value.If a value is present, isPresent() will
	//return true and get() will return the value. 
	
	@RequestMapping("getById/{eid}")
	public Person getbyId(@PathVariable("eid") int pid) {
		
		Optional<Person> p=service.getPersonById(pid);
		Person pObj=null;
		if(p.isPresent()){
		 pObj=p.get();	
		}		
		return pObj;
	}
	@RequestMapping("getByName/{ename}")
	public Person getbyName(@PathVariable("ename") String name) {
		return service.getPersonByName(name);
	}	
	@RequestMapping("getBoth/{ename}/{addr}")
	public Person getbyName(@PathVariable("ename") String name,@PathVariable("addr") String addr) {
		return service.findUsingNameAddr(name, addr);
	}	
	
}





