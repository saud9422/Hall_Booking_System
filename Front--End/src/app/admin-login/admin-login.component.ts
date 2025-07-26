import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent {
  adminId = '';
  password = '';
  errorMsg = '';

  constructor(private router: Router) {}

  onLogin() {
    if (this.adminId === 'admin123' && this.password === 'pass123') {
      this.router.navigate(['/view-bookings']);
    } else {
      this.errorMsg = 'Invalid ID or password';
    }
  }
}
