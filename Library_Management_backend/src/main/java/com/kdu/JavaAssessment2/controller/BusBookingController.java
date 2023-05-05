package com.kdu.JavaAssessment2.controller;

import com.kdu.JavaAssessment2.entity.UserBus;
import com.kdu.JavaAssessment2.model.booking.BookingModel;
import com.kdu.JavaAssessment2.service.booking.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/booking")
public class BusBookingController {
    @Autowired
    BookingServiceImpl bookingService;

    @GetMapping("/get-all-bookings")
    ResponseEntity<List<Object[]>> getAllBookings(@RequestParam(name = "bookingId")String bookingId ){
        return new ResponseEntity<>(bookingService.getAllBookings(bookingId), HttpStatus.OK);
    }

    @PostMapping("/make-booking")
    ResponseEntity<String> makeBooking(@Valid @RequestBody BookingModel bookingModel){
        return new ResponseEntity<>(bookingService.makeBooking(bookingModel),HttpStatus.OK);
    }
}
