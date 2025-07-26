import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { Imessege } from '../models/booking.model';

@Component({
  selector: 'app-messege',
  templateUrl: './messege.component.html',
  styleUrls: ['./messege.component.css']
})
export class MessegeComponent implements OnInit {
constructor(private http:HttpClient){

}
messege:Imessege[]=[];

  ngOnInit(): void {
     this.getMessege();
  }
  getMessege(){
    this.http.get('http://localhost:8080/Messege/get').subscribe((Response:any)=>{
      this.messege=Response;
    })
  }
}
