package com.example.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
@Autowired
private PersonRepository personRepository;
public List<Person> getPersonList()
{
	return this.personRepository.findAll();
}
public Person addPersondetais(Person p) {
	return personRepository.save(p);
}
public Optional<Person>searchById(int PersonId){
	return personRepository.findById(PersonId);
}
public String removepersondetails(int personId) {
	 personRepository.deleteById(personId);
	 return "deleted successfuly";
}
 /*public  Person update(int personId,Person pr) {
	pr.setPersonId(personId);
	this.personRepository.put(personId,pr);
	return pr;*/
 }



