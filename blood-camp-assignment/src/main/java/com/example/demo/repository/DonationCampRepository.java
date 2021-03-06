package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.DonationCamp;
import com.example.demo.entity.Donors;

public interface DonationCampRepository  extends JpaRepository<DonationCamp, String>{
	@Query(nativeQuery=true,value="select * from donationcamp where campname=:camp ")
	@Modifying
	@Transactional
	public List<DonationCamp> findByCamp(@Param("camp")String campName);
	
	
	

}
