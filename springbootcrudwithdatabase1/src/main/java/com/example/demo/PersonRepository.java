package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	//void put(int personId, Person pr);

}

