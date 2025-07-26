import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-booking-success',
  templateUrl: './booking-success.component.html',
  styleUrls: ['./booking-success.component.css']
})
export class BookingSuccessComponent implements OnInit {
code:number=0;

    ngOnInit(): void {
       this.code= history.state.bookingCode;
        console.log(this.code);
    }
    
  




}



