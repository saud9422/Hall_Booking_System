import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BookingService } from '../services/booking.service';

@Component({
  selector: 'app-booking-details',
  templateUrl: './booking-details.component.html'
})
export class BookingDetailsComponent implements OnInit {
  booking: any;

  constructor(private bookingService: BookingService, private router: Router) {}

  ngOnInit(): void {
    this.booking = this.bookingService.getBookingData();

    // 🧠 DEBUG
    console.log('Booking loaded in BookingDetailsComponent:', this.booking);

    // Optional: Handle empty booking if accessed directly without data
    if (!this.booking) {
      alert('No booking data found. Please search again.');
      this.router.navigate(['/']);
    }
  }
}
