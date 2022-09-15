package com.example.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
@Autowired
private PersonService personService;
@GetMapping("/persondetails")
public List<Person> getPersonDetails()
{
	return this.personService.getPersonList();
}
@PostMapping("/addpersondetails")
public Person addPersondetais(@RequestBody Person pr) {
	return this.personService.addPersondetais(pr);
}
@GetMapping("/persondetails/{personId}")
public Optional<Person> search(@PathVariable int personId) 
{
	return this.personService.searchById(personId);
}

/*@PutMapping("/updatepersondetails/{personId}")
public Person update(@PathVariable int personId,@RequestBody Person pr) {
	return this.update(personId, pr);
}*/

@DeleteMapping("/deletepersondetails/{personId}")
public String removePerson(@PathVariable int personId) {
	return this.personService.removepersondetails(1);
}



}

