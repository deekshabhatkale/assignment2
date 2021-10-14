package com.example.demo.entity;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.*;

@Data
@Component
@FieldDefaults(level=AccessLevel.PRIVATE)

public class Donors {
	 int id;
	 @Length(min=3,max=20,message="name should be between 3-20")
	 String firstName;
	 String lastName;
	 String phone;
	 String bloodGroup;
	 String location;
	 @DateTimeFormat(iso=ISO.DATE)
	 LocalDate donationDate;
	 String campmember;
}
