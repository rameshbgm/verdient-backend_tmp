package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rate_Master {
    @Id
    @GeneratedValue
	int id;
    String groupcode;
    Long amount;
    String audit;
    String Remark;
}
