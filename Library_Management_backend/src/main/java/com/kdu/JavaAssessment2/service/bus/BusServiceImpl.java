package com.kdu.JavaAssessment2.service.bus;

import com.kdu.JavaAssessment2.entity.Bus;
import com.kdu.JavaAssessment2.model.bus.BusModel;
import com.kdu.JavaAssessment2.repo.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
public class BusServiceImpl implements IBusService {

    @Autowired
    BusRepository busRepository;

    @Override
    public String insertBus(BusModel busModel, BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            return "something went wrong while adding bus!";
        }
        Bus bus = Bus.builder()
                .busName(busModel.getBusName())
                .date(busModel.getDate())
                .startAt(busModel.getStartAt())
                .endAt(busModel.getEndAt())
                .build();
        busRepository.save(bus);
        return "bus added successfully!";
    }
}
