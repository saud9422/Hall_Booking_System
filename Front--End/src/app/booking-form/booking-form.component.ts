import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-booking-form',
  templateUrl: './booking-form.component.html',
  styleUrls: ['./booking-form.component.css']
})
export class BookingFormComponent implements OnInit {

  id: number = 0;
  name: string = '';
  bookingCode: number = 0;

  bookingdata: any = {
    hall_id: 0,
    hall_name: '',
    booking_code: 0,
    username: '',
    phone_no: 0,
    adhaar_no: 0,
    booking_date: '',
    event: '',
    address: '',
    number_of_days: ''
  };

  constructor(private route: Router, private http: HttpClient) {}

  ngOnInit(): void {
    // Get hall data from navigation state
    this.id = history.state.hallId;
    this.name = history.state.hallName;
    this.bookingCode = this.genrateBookingCode();

    console.log("Hall ID:", this.id);
    console.log("Hall Name:", this.name);
    console.log("Booking Code:", this.bookingCode);

    // Now update bookingdata with correct values
    this.bookingdata.hall_id = this.id;
    this.bookingdata.hall_name = this.name;
    this.bookingdata.booking_code = this.bookingCode;
  }

  genrateBookingCode(): number {
    return Math.floor(100000 + Math.random() * 900000);
  }

  saveBooking() {
  console.log("Booking data to be sent:", this.bookingdata);
  this.http.post("http://localhost:8080/bookings/add", this.bookingdata, { responseType: 'text' })
    .subscribe({
      next: (result: any) => {
        console.log("Booking successful:", result);
        this.route.navigate(['/success'] ,{
          state: { bookingCode: this.bookingCode } 
        });
      },
      error: (error) => {
        console.error("Booking failed. Error details:", error);
        alert("Booking failed. Please try again.");
      }
    });
}

}
