import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-hall-form',
  templateUrl: './hall-form.component.html',
  styleUrls: ['./hall-form.component.css']
})
export class HallFormComponent {

  constructor(private route: Router, private http: HttpClient) {}

  hallData: any = {
    hallName: '',
    location: '',
    capacity: 0,
    amenities: '',
    price: '',
    imageUrl: ''
  };

  SaveHall() {
    console.log("Sending hall data:", this.hallData);
    this.http.post('http://localhost:8080/Halls/save', this.hallData)
      .subscribe({
        next: () => {
          alert("Hall added successfully.");
          this.resetForm();
        },
        error: (err) => {
          console.error("Failed to add hall", err);
          alert("Failed to add hall.");
        }
      });
  }

  resetForm() {
    this.hallData = {
      hallName: '',
      location: '',
      capacity: 0,
      amenities: '',
      price: '',
      imageUrl: ''
    };
  }
}
