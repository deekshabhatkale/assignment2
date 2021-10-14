package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Donors;

import com.example.demo.repository.DonorRepository;

@Service
public class DonorService {

	@Autowired 
	private DonorRepository repo;
	public List<Donors> findAll(){
		return this.repo.findAll();
	}

	 public Donors addDonor(Donors entity) {
	    	return this.repo.save(entity);
	 }

	 public List<Donors> findByBloodGroupAvailability( String key){
	    	return  this.repo.findByBloodGroupAvailability(key);
	 }

		public List<Donors> findByGroup(String group) {
			
			return this.repo.findByGroup(group);
		}
	
		public List<Donors> findByLocation(String loc) {
			
			return this.repo.findByLocation(loc);
		}
		public List<Donors> findByCamp(String loca) {
			
			return this.repo.findByCamp(loca);
		}
		
//		public int updateCamp(int id) {
//			
//			return this.repo.updateCamp(id);
//		}
		
		public int updateInfo(int id,LocalDate newDate) {
			
			return this.repo.updateInfo(id,newDate);
		}		

		public int remove(int id) {
			
			int rowDeleted=0;
			if(this.repo.existsById(id)) {
				this.repo.deleteById(id);
				rowDeleted = 1;
			}
			return rowDeleted;
			
		
		}
		
	

}
