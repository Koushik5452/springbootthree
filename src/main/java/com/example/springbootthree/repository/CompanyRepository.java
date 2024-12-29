package com.example.springbootthree.repository;

import com.example.springbootthree.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String>{
      
	
}
