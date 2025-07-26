import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { MainComponent } from './main/main.component';
import { BookingDetailsComponent } from './booking-details/booking-details.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { ViewBookingsComponent } from './view-bookings/view-bookings.component';

import { SuccessComponent } from './success/success.component';
import { BookingFormComponent } from './booking-form/booking-form.component';
import { BookingSuccessComponent } from './booking-success/booking-success.component';
import { HallFormComponent } from './hall-form/hall-form.component';
import { DeleteHallComponent } from './delete-hall/delete-hall.component';
import { DeletebookingComponent } from './deletebooking/deletebooking.component';
import { MessegeComponent } from './messege/messege.component';




@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    BookingDetailsComponent,
    HeaderComponent,
    FooterComponent,
    AdminLoginComponent,
    ViewBookingsComponent,
  
    SuccessComponent,
       BookingFormComponent,
       BookingSuccessComponent,
       HallFormComponent,
       DeleteHallComponent,
       DeletebookingComponent,
       MessegeComponent,
   
   
    ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
