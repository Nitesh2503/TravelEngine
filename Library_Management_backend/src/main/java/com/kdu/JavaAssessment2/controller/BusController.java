package com.kdu.JavaAssessment2.controller;

import com.kdu.JavaAssessment2.model.bus.BusModel;
import com.kdu.JavaAssessment2.service.bus.BusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    BusServiceImpl busService;

    @PostMapping("/add-bus")
    ResponseEntity<String> addBus(@Valid @RequestBody BusModel busModel, BindingResult bindingResult){
        return new ResponseEntity<>(busService.insertBus(busModel,bindingResult), HttpStatus.OK);
    }
}
