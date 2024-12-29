package com.example.springbootthree.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Automobile {
	
	@Id
	private String company_name;
	
	private String owner_name;
	private Integer branches;
	private String address;

}
