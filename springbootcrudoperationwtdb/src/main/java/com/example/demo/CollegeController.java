package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {
@GetMapping("/collegedetails")
public List<College> getCollegeDetails(){
	return CollegeService.getCollegeDetails();
}
@GetMapping("/collegedetails/{collegeId}")
public College getCollegeById(@PathVariable int collegeId) 
{
	return CollegeService.getCollegeDetailsById(collegeId);
}
@PostMapping("/addcollegedetails")
public College addCollege(@RequestBody College col) {
	return CollegeService.addCollegeDetails(col);
}
@PutMapping("/updatecollegedetails/{collegeId}")
public College update(@PathVariable int collegeId,@RequestBody College col) {
	return CollegeService.update(collegeId,col);
}

@DeleteMapping("/deletecollegedetails/{collegeId}")
public College removeCollege(@PathVariable int collegeId) {
	return CollegeService.removeColegeDetailsById(1);
}

}
