package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.CollegeModel;

public interface CollegeRepo extends JpaRepository<CollegeModel,Integer> {

    
}