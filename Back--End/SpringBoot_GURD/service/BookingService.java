package com.TKA.SpringBoot_GURD.service;

import com.TKA.SpringBoot_GURD.dao.BookingDAO;
import com.TKA.SpringBoot_GURD.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingDAO bookingDAO;

    @Autowired
    public BookingService(BookingDAO bookingDAO) {
        this.bookingDAO = bookingDAO;
    }

    public void addBooking(Booking booking) {
        bookingDAO.insertBooking(booking);
    }

    public Booking getBookingByBookingCode(int bookingCode) {
        return bookingDAO.getBookingByBookingCode(bookingCode);
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }

    public void deleteBooking(int bookingCode) {
        bookingDAO.deleteBooking(bookingCode);
    }
}
