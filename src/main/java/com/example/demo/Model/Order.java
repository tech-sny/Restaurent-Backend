package com.example.demo.Model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String userModelID;
    private String transactionModelId;
    private String shopModelID;
    private String date;
    private String orderStatus;
    private String lastStatusUpdatedTime;
    private Double price;
    private Double deliveryPrice;
    private String deliveryLocation;
    private String cookingInfo;
    private Double rating;
    private String secretKey;
}
