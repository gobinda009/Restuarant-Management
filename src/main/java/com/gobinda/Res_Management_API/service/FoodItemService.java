package com.gobinda.Res_Management_API.service;

import com.gobinda.Res_Management_API.model.FoodItem;
import com.gobinda.Res_Management_API.repository.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    IFoodRepo ifoodrepo;
    public List<FoodItem> getall() {
        return ifoodrepo.findAll();

    }
}
