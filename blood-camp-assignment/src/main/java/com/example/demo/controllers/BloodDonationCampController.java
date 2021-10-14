package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DonationCamp;
import com.example.demo.entity.Donors;
import com.example.demo.services.BloodDonationService;
import com.example.demo.services.DonorService;
@RestController
@RequestMapping(path="/api/v1/camps/")
public class BloodDonationCampController {
	@Autowired
	private BloodDonationService campService;

	
	
	public void setService(BloodDonationService campService)
	{
		this.campService=campService;
	}
	
	@PostMapping //(path = "/api/v1/students")
	public ResponseEntity<DonationCamp> addDonor(@RequestBody DonationCamp entity) {
		DonationCamp addedEntity = this.campService.addDoationCamp(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);
	}
	
	
	
	@GetMapping(path="/{campName}")
	public List<DonationCamp> findByCamp(@PathVariable("campName") String campName)
	{
		return this.campService.findByCamp(campName);
	}
	
}
