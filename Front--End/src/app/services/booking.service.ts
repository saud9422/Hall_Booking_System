import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Booking } from '../models/booking.model';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class BookingService {
  private apiUrl = 'http://localhost:8080/bookings/get'; // Change if needed
   private Url = 'http://localhost:8080/bookings/add';
  private bookingData: any;

  constructor(private http: HttpClient) {}
  
   bookHall(booking: Booking): Observable<any> {
    return this.http.post(this.Url, booking);
  }

  fetchBooking(bookingCode: string): Observable<any> {
    return this.http.post<any>(this.apiUrl, { bookingCode });
  }

  setBookingData(data: any) {
    this.bookingData = data;
  }

  getBookingData() {
    return this.bookingData;
  }
}
