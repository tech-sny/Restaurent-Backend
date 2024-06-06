package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.TransactionModel;

public interface TransactionRepo extends JpaRepository<TransactionModel,String>{

    
} 
