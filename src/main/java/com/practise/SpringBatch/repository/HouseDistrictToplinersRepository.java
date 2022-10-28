package com.practise.SpringBatch.repository;

import com.practise.SpringBatch.model.HouseDistrictToplines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseDistrictToplinersRepository extends JpaRepository<HouseDistrictToplines, Integer> {

}
