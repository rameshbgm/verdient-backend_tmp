package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
@Data
public class Registration {
     @Id
     @GeneratedValue
	 int id;
     String email_id;
     String username;
     String firstname;
     String lastname;
     String middlename;
     long phone_number;
     String village;
     int age;
     String gender;
     String address;
     
     
}
