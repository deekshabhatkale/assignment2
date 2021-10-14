package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Donors;
@Repository
public interface DonorRepository extends JpaRepository<Donors, Integer> {
	
public List<Donors> findByLocation(String location);
	
@Query(nativeQuery=true,value="select * from donors where bloodgroup=:grp and  donationdate<='15-APR-21'")
@Modifying
@Transactional
public List<Donors> findByBloodGroupAvailability(@Param("grp") String bloodGroup);

@Query(nativeQuery=true,value="select * from donors where bloodgroup=:grp")
@Modifying
@Transactional
public List<Donors> findByGroup(@Param("grp") String bloodGroup);

@Query(nativeQuery=true,value="select * from donors where location=:loc and campmember is not null")
@Modifying
@Transactional
public List<Donors> findByCamp(@Param("loc")String location);



@Query(nativeQuery = true,value = "update  donors set donationdate=:newDate where id =:number")
@Modifying
@Transactional
public int updateInfo(@Param("number")int id,@Param("newDate") LocalDate newDate);

}
