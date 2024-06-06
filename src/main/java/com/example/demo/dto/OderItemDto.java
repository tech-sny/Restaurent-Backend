package com.example.demo.dto;

import com.example.demo.Model.ItemModel;
import com.example.demo.Model.Order;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OderItemDto {
    private Order orderModel;
    private ItemModel itemModel;
    private Integer quantity;
    private Double price;
}
