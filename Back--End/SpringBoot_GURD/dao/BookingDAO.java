package com.TKA.SpringBoot_GURD.dao;
import com.TKA.SpringBoot_GURD.entity.*;


import java.util.List;

public interface BookingDAO {
    void insertBooking(Booking booking);
    Booking getBookingByBookingCode(int bookingCode);
    List<Booking> getAllBookings();
    void deleteBooking(int bookingCode);
}
