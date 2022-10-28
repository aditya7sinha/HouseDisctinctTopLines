package com.practise.SpringBatch.batch;

import com.practise.SpringBatch.model.HouseDistrictToplines;
import com.practise.SpringBatch.repository.HouseDistrictToplinersRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<HouseDistrictToplines> {
    @Autowired
    private HouseDistrictToplinersRepository houseDistrictToplinersRepository;
    @Override
    public void write(List<? extends HouseDistrictToplines> list) throws Exception{
        System.out.println("Data Saved for HouseDistrictToplines: "+ list);
        houseDistrictToplinersRepository.saveAll(list);
    }
}
