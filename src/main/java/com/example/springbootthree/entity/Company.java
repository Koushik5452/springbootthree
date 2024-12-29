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
public class Company {
 
	@Id
	private String companyName;
	private String ownerName;
	private String mainAddress;
	private String email;
}
