package com.sathya.orm.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sathya.orm.Person;
import com.sathya.orm.details.PersonDetails;
import com.sathya.orm.mapper.PersonMapper;
import com.sathya.orm.repository.PersonRepository;

@Component
public class PersonClient implements CommandLineRunner {
	@Autowired
	PersonRepository personRepository ;
	
	@Autowired
	PersonMapper mapper;
	
	
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		PersonDetails personDetails = new PersonDetails();
		personDetails.setFirstname("Aravind");
		personDetails.setLastname("Rathod");
		personDetails.setEmail("ccyyc@gmail.com");
		personDetails.setAge(21);
		
		
	Person p  =	mapper.modelToEntityConversion(personDetails);
		personRepository.save(p);
	}

}
