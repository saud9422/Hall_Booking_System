import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-deletebooking',
  templateUrl: './deletebooking.component.html',
  styleUrls: ['./deletebooking.component.css']
})
export class DeletebookingComponent {


  constructor(private route:Router,private http:HttpClient){
  
  }
  deletedata:any={
  bookingCode:0
  }
  
  
  deleteBooking() {
    console.log("Deleting booking with bookingCode", this.deletedata.bookingCode);
    this.http.post('http://localhost:8080/bookings/delete',this.deletedata ,{responseType:'text'}).subscribe({
      next:(Response:any)=>{
        console.log(Response);
        alert('The booking is Deleted Successfully..')
      },
      error(err) {
          console.error(err);
          alert('Booking is Not Deleted Due to Error..')
      },
    })
  }
  
}
