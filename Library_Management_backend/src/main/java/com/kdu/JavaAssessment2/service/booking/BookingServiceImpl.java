package com.kdu.JavaAssessment2.service.booking;

import com.kdu.JavaAssessment2.entity.UserBus;
import com.kdu.JavaAssessment2.model.booking.BookingModel;
import com.kdu.JavaAssessment2.repo.BusRepository;
import com.kdu.JavaAssessment2.repo.UserBookingDetailRepository;
import com.kdu.JavaAssessment2.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements IBookingService {

    @Autowired
    UserBookingDetailRepository userBookingDetailRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    BusRepository busRepository;

    @Override
    public List<Object[]> getAllBookings(String bookingId) {
        List<Object[]> bookings = null;
        bookings = userBookingDetailRepository.findByBookingId(Long.parseLong(bookingId));
        return bookings;
    }

    @Override
    public String makeBooking(BookingModel bookingModel) {
        System.out.println("chalo>>" + busRepository.findByBusId(bookingModel.getBusId()));
        if (busRepository.findByBusId(bookingModel.getBusId()) != null) {
            UserBus newUserBusData = UserBus.builder()
                    .bus(busRepository.findByBusId(bookingModel.getBusId()))
                    .user(userRepository.findByUserName(bookingModel.getUserName()))
                    .build();
            userBookingDetailRepository.save(newUserBusData);
            return "Booking successful";
        }
        return "Bus with id-" + bookingModel.getBusId() + " doesn't exist";
    }
}
