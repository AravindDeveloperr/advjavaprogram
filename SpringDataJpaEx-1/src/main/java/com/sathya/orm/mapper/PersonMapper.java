package com.sathya.orm.mapper;




import org.springframework.stereotype.Component;

import com.sathya.orm.Person;
import com.sathya.orm.details.PersonDetails;
@Component
public class PersonMapper {

	
	
	//This method taking model class as input & return entity class as output
	 
	
		public Person modelToEntityConversion(PersonDetails personDetails) {
			
			
			// read the data from model class set to entity class
			
			Person person= new Person();
			person.setAge(personDetails.getAge());
			person.setFirstName(personDetails.getFirstname());
			person.setLastName(personDetails.getLastname());
			person.setAge(personDetails.getAge());
			person.setEmail(personDetails.getEmail());
			return person;
			
			
			
			
			
		}
		
//		public List<Person> modelToEntityConversion1(List<PersonDetails>personDetails){
//			List<Person> products=new ArrayList<Person>();
//			//Reading the data from model class & setting the data to entity class
//			for(PersonDetails perDetail:personDetails)
//			{
//				Person person= new Person();
//				
//				person.set
//			
//			}
//			return persons;
//			
//			
//		}
//		

}
