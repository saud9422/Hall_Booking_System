import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-delete-hall',
  templateUrl: './delete-hall.component.html',
  styleUrls: ['./delete-hall.component.css']
})
export class DeleteHallComponent {
constructor(private route:Router,private http:HttpClient){

}
deletedata:any={
hallId:0
}


deleteHall() {
  console.log("Deleting hall with ID:", this.deletedata.hallId);
  this.http.post('http://localhost:8080/Halls/delete',this.deletedata ,{responseType:'text'}).subscribe({
    next:(Response:any)=>{
      console.log(Response);
      alert('The Hall is Deleted Successfully..')
    },
    error(err) {
        console.error(err);
        alert('hall is Not Deleted Due to Error..')
    },
  })
}



}
