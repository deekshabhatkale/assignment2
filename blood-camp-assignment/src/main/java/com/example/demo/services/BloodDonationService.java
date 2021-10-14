package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DonationCamp;
import com.example.demo.entity.Donors;
import com.example.demo.repository.DonationCampRepository;
import com.example.demo.repository.DonorRepository;
@Service
public class BloodDonationService {
	
	@Autowired 
	private DonationCampRepository repo;
	
	public DonationCamp addDoationCamp(DonationCamp entity) {
    	return this.repo.save(entity);
 }

	public List<DonationCamp> findByCamp(String campName) {
		
		return this.repo.findByCamp(campName);
	}
	
	
}
