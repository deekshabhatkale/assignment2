package com.example.demo.controllers;

import java.time.LocalDate;

import java.util.List;




import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Donors;

import com.example.demo.services.DonorService;


@RestController
@RequestMapping(path="/api/v1/donors/")
public class BloodDonorController {
	@Autowired
	private DonorService donorService;

	
	
	public void setService(DonorService donorService)
	{
		this.donorService=donorService;
	}
	
	@GetMapping
	@RolesAllowed(value = {"ROLE_ADMIN"})
	public List<Donors> findAll()
	{
		return this.donorService.findAll() ;
	}
	@PostMapping //(path = "/api/v1/students")
	public ResponseEntity<Donors> addDonor(@RequestBody Donors entity) {
		Donors addedEntity = this.donorService.addDonor(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);
	}
	
	@GetMapping (path="/srch/available/{bloodGroup}") 
	public List<Donors> findByBloodGroupAvailability(@PathVariable("bloodGroup")String bloodGroup){
		return this.donorService.findByBloodGroupAvailability(bloodGroup);
	}
	
	@GetMapping(path="/{bloodGroup}")
	public List<Donors> findByGroup(@PathVariable("bloodGroup") String bloodGroup)
	{
		return this.donorService.findByGroup(bloodGroup);
	}
	
	@GetMapping(path="/srch/{location}")
	public List<Donors> findByLocation(@PathVariable("location") String location)
	{
		return this.donorService.findByLocation(location);
	}

	
	@GetMapping(path="/camp/{location}/members")
	public List<Donors> findByCamp(@PathVariable("location") String location)
	{
		return this.donorService.findByCamp(location);
	}	
	
//	@PutMapping (path="/addme/{id}") 
//	public ResponseEntity<String> updateMark(@PathVariable("id")int id){
//		
//		int count =  this.donorService.updateCamp(id);
//		return ResponseEntity.ok().body(count+":RecordsUpdated0");
//	}
	
	@PutMapping (path="/update/{id}") 
	public ResponseEntity<String> updateInfo(@PathVariable("id")int id,@PathVariable("donationDate")LocalDate donationDate){
		
		int count =  this.donorService.updateInfo(id,donationDate);
		return ResponseEntity.ok().body(count+":RecordsUpdated0");
	}
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<String> removeStudent(@PathVariable("id") int id){
		
		int count =  this.donorService.remove(id);
		HttpStatus status = HttpStatus.NOT_FOUND;
		String message="Record Not Found";
		
		if(count==1){
			
		        status=HttpStatus.OK;
				message =" One Record Deleted";
		}
		return ResponseEntity.status(status).body(message);
	
	}	

	
}
