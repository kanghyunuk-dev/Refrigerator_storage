package com.firstproject.firstproject.foodstorage;

import com.firstproject.firstproject.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface FoodStorageRepository extends JpaRepository<FoodStorage, Long> {
    List<FoodStorage> findByMember(Member member);

    List<FoodStorage> findByMemberAndStorageType(Member member, StorageType storageType);

    List<FoodStorage> findByExpdateBefore(Date expDay);
}
