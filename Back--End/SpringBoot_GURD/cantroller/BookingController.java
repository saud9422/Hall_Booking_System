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

    // ✅ Add a new booking
    @PostMapping("/add")
    public String addBooking(@RequestBody Booking booking) {
     
    	System.out.println(booking.getBooking_code());
        try {
            bookingService.addBooking(booking);
       
            return "Booking is successful.";
        } catch (Exception e) {
            e.printStackTrace();
            return "Booking failed: " + e.getMessage();
        }
    }

    // ✅ Get booking by booking code
    @PostMapping("/get")
    public Booking getBooking(@RequestBody Map<String, Integer> payload) {
        int bookingCode = payload.get("bookingCode");
        return bookingService.getBookingByBookingCode(bookingCode);
    }

    // ✅ Get all bookings
    @GetMapping("/all") // changed to GET since it's a read operation
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    // ✅ Delete booking by booking code
    @PostMapping("/delete")
    public String deleteBooking(@RequestBody Map<String, Integer> payload) {
        int bookingCode = payload.get("bookingCode");
        bookingService.deleteBooking(bookingCode);
        return "Booking deleted successfully.";
    }
}
