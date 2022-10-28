package com.practise.SpringBatch.batch;

import com.practise.SpringBatch.model.HouseDistrictToplines;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<HouseDistrictToplines,HouseDistrictToplines> {

    @Override
    public HouseDistrictToplines process(HouseDistrictToplines houseDistrictToplines) throws Exception {
    return houseDistrictToplines;
}
}
