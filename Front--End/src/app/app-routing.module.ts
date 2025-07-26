import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminLoginComponent} from './admin-login/admin-login.component';
import { MainComponent } from './main/main.component';
import { ViewBookingsComponent } from './view-bookings/view-bookings.component';
import { BookingDetailsComponent } from './booking-details/booking-details.component';
import { SuccessComponent } from './success/success.component';
import { BookingFormComponent } from './booking-form/booking-form.component';
import { BookingSuccessComponent } from './booking-success/booking-success.component';
import { HallFormComponent } from './hall-form/hall-form.component';
import { DeleteHallComponent } from './delete-hall/delete-hall.component';
import { DeletebookingComponent } from './deletebooking/deletebooking.component';
import { MessegeComponent } from './messege/messege.component';



const routes: Routes = [
  { path: '', component: MainComponent },
   { path: '', component: BookingDetailsComponent },
  { path: 'booking-details', component: BookingDetailsComponent },
  { path: 'admin-login', component: AdminLoginComponent },
   { path: '', component: AdminLoginComponent },
  { path: 'view-bookings', component: ViewBookingsComponent },
  { path : 'booking-form', component:BookingFormComponent},
  {path:'success', component:BookingSuccessComponent},
 {path: 'hallform',component:HallFormComponent},
  {path : 'deletehall',component:DeleteHallComponent},
  {path:'deletebooking' ,component:DeletebookingComponent},
  {path:'messege',component:MessegeComponent}
];

  




@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
