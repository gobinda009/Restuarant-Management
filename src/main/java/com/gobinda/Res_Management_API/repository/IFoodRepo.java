package com.gobinda.Res_Management_API.repository;

import com.gobinda.Res_Management_API.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepo extends JpaRepository<FoodItem,Long> {

}