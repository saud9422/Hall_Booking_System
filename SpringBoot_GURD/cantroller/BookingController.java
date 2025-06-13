package com.TKA.SpringBoot_GURD.cantroller;

import com.TKA.SpringBoot_GURD.entity.Booking;
import com.TKA.SpringBoot_GURD.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@CrossOrigin
@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    // Add a new booking
    @PostMapping("/add")
    public String addBooking(@RequestBody Booking booking) {
        System.out.println("Received booking code: " + booking.getBooking_code());  // ✅ Confirm here
    
        		bookingService.addBooking(booking);
        		return "Booking is Succesfull..";
    }

    

    // Get booking by bookingCode from request body
    @PostMapping("/get")
    public Booking getBooking(@RequestBody Map<String, Integer> payload) {
        int bookingCode = payload.get("bookingCode");
        return bookingService.getBookingByBookingCode(bookingCode);
    }

    // Get all bookings (no input required)
    @PostMapping("/all")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    // Delete booking by bookingCode from request body
    @PostMapping("/delete")
    public String deleteBooking(@RequestBody Map<String, Integer> payload) {
        int bookingCode = payload.get("bookingCode");
        bookingService.deleteBooking(bookingCode);
        return "Booking deleted successfully.";
    }
}
