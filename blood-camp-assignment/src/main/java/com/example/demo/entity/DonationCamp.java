package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="donationcamp")
public class DonationCamp {
	@Id
	@Column(name="campname")
	String campName;
	
	@Column(name="donorname")
	String donorName;
	
	@Column(name="bloodgroup")
	String bloodGroup;
	
	

}
