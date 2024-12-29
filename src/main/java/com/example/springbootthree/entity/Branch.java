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
public class Branch {
	
	@Id
	private String branchName;
	private String adminName;
	private String address;
	private Integer contact;
	
	
	

}
