package com.cts.springbootjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.springbootjpa.Person;
@Repository
public interface IPersonDao  extends JpaRepository<Person, Integer> {

	@Query(value="FROM Person p where p.personName =:pn")
	public Person findByPersonName(@Param("pn") String name);
	
	@Query(value="FROM Person p where p.personName =:pn and p.addr=:addr")
	public Person findUsingNameAddr(@Param("pn")String n, @Param("addr") String ad);
	
	@Query(value="FROM Person p where p.personId = :pd")
	public Person findByPersonId(@Param("pd") int id);
}
