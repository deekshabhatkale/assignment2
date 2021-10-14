package com.example.demo.entity;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
@Data
@Component
@FieldDefaults(level=AccessLevel.PRIVATE)
public class DonationCamp {
	String campName;
	String DonorName;
	String bloodGroup;

}
