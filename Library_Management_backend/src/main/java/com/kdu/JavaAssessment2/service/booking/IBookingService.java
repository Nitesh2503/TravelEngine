package com.kdu.JavaAssessment2.service.booking;

import com.kdu.JavaAssessment2.entity.UserBus;
import com.kdu.JavaAssessment2.model.booking.BookingModel;

import java.util.List;

public interface IBookingService {
    public List<Object[]> getAllBookings(String bookingId);
    public String makeBooking(BookingModel bookingModel);
}
