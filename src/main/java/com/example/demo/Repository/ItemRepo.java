package com.example.demo.Repository;

import com.example.demo.Model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<ItemModel,Integer> {
}
