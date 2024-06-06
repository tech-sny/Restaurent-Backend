package com.example.demo.Controller;

import com.example.demo.Model.ItemModel;
import com.example.demo.Model.Order;
import com.example.demo.Repository.ItemRepo;
import com.example.demo.Repository.OrderRepo;
import com.example.demo.dto.OderItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {//dummy commit
    @Autowired
    OrderRepo orderRepo;
    @Autowired
    ItemRepo itemRepo;
    @GetMapping("/get")
    public List<OderItemDto> getWebPage() {
        List<OderItemDto> orderList = new ArrayList<>();
        OderItemDto od = new OderItemDto();
        ItemModel itemModel = itemRepo.findAll().getFirst();//add all
        Order order = orderRepo.findAll().getFirst();
        od.setItemModel(itemModel);
        od.setPrice(itemModel.getPrice());
        od.setQuantity(3);
        od.setOrderModel(order);
        orderList.add(od);
        return orderList;

    }

    
}
