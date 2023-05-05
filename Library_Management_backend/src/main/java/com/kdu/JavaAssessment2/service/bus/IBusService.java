package com.kdu.JavaAssessment2.service.bus;


import com.kdu.JavaAssessment2.model.bus.BusModel;
import org.springframework.validation.BindingResult;

public interface IBusService {
    public String insertBus(BusModel busModel, BindingResult bindingResult);
}
