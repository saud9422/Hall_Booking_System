import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BookingService } from '../services/booking.service';
import { HttpClient } from '@angular/common/http';
import { Messege } from '../models/booking.model';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css'], // 
})
export class MainComponent implements OnInit{
  bookingCode = '';
  error = '';


  constructor(private bookingService: BookingService,
               private router: Router,private http:HttpClient) {}

                halls: any[] = [];
                messege:Messege=new Messege();

               ngOnInit(): void {
    this.fetchHalls();
  }
 
   fetchHalls() {
     this.http.get<any[]>('http://localhost:8080/Halls/get').subscribe({
       next: (response) => {
         this.halls = response;
         console.log(this.halls)
       },
       error: (err) => {
         console.error("Error fetching halls", err);
         alert("Failed to load halls from backend.");
       }
     });
   }
  searchBooking() {
     this.bookingService.fetchBooking(this.bookingCode).subscribe({
       next: (data) => {
         console.log('API success, booking data:', data);
         this.bookingService.setBookingData(data);
         this.router.navigate(['/booking-details']);
       },
       error: () => {
         console.log('API error:', this.error);
         this.error = 'Booking not found!';
       },
     });
  
   }

 bookHall(hallId: number, hallName: string) {
   console.log(hallId)
   this.router.navigate(['/booking-form'], {
     state: { hallId, hallName}
    
   });
 }

getMessege(){
  this.http.post<Messege>('http://localhost:8080/Messege/save',this.messege).subscribe((Response:Messege)=>{
    console.log(this.messege)  
    alert("Messege is Sent Successfully..")
  })
    
  }
}   






 
 