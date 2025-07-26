import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AdminLoginComponent } from '../admin-login/admin-login.component';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  constructor(private router:Router){}
goto(){
  this.router.navigate(['app-admin-login'])
}
}
