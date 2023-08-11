package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
@Data
public class Address {

	@Column(name = "ADDRESS1")
	String address1;
	@Column(name = "ADDRESS2")
	String address2;
	@Column(name = "LANENUMBER")
	String laneNumber;
	@Column(name = "HOUSENUMBER")
	String houseNumber;
	@Column(name = "PINCODE")
	String pincode;
	
	
}
