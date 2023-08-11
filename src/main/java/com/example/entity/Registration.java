package com.example.entity;

import javax.persistence.Column;
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
     String emailId;

     @Column(name="USER_NAME")
     String userName;
     @Column(name="FIRST_NAME")
     String firstName;

     @Column(name="LAST_NAME")
     String lastName;

     @Column(name="MIDDLE_NAME")
     String middleName;

     @Column(name="PHONE_NUMBER")
     long phoneNumber;

     @Column(name="AGE")
     int age;

     @Column(name="GENDER")
     String gender;
     
     
}
