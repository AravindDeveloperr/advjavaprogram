package com.sathya.orm.details;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDetails {
	
	private int id;
	private String firstname;
	private String lastname; 
	private String Email;
	private int age; 

}