package com.firstproject.firstproject.foodinfo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodInfoRepository extends JpaRepository<FoodInfo, Long> {
    List<FoodInfo> findByFoodnameContaining(String foodname);
}
