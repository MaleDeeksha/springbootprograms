package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Passport;
import com.spring.repository.PassportRepository;

@Service
public class PassportService {
	@Autowired
	public PassportRepository passportRepository;

	public Iterable<Passport> listAll(){
		return passportRepository.findAll();
	}
	public Passport addPassport(Passport p) {
		return passportRepository.save(p);
	}
	public Passport SerarchById(int id) {
		return passportRepository.findById(id).get();
	}

}
