import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-view-bookings',
  templateUrl: './view-bookings.component.html',
  styleUrls: ['./view-bookings.component.css']
})
export class ViewBookingsComponent implements OnInit {
  bookings: any[] = [];
  errorMsg = '';

  constructor(private http: HttpClient ,private route:Router) {}
hallform(){
  this.route.navigate(['/hallform'])
}
deletehall(){
  this.route.navigate(['/deletehall'])
}
deletebooking(){
  this.route.navigate(['/deletebooking'])
}
messege(){
  this.route.navigate(['messege'])
}
  ngOnInit(): void {
    // POST request with empty body
    this.http.get<any[]>('http://localhost:8080/bookings/all', {})
      .subscribe({
        next: data => {
          this.bookings = data;
          console.log(this.bookings)
        },
        error: err => {
          console.error('Error fetching bookings:', err);
          this.errorMsg = 'Failed to fetch bookings';
        }
      });

      
  }
}
