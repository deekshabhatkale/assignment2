package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@Table(name="donors")
public class Donors {
	@Id
	@Column(name="id")
	
	int id;
	
	@Column(name="fname")
	String firstName;
	
	@Column(name="lname")
	String lastName;
	
	
	@Column(name="phone")
	String phone;
	
	@Column(name="location")
	String location;
	
	@Column(name="bloodgroup")
	String bloodGroup;
	
	@Column(name="donationdate")
	LocalDate donationDate;
	
	@Column(name="campmember")
	String campmember;

}
