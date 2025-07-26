

export interface Booking {
  hallId: number;
  hallName: string;
  bookingCode: number;
  fullName: string;
  phone_no: number;
  adhaar_no: number;
  booking_date: Date;
  event: string;
  number_of_days: number;
}


export class Messege{
  name:string;
  email:string;
  messege:string;

  constructor(){
    this.name='';
    this.email='';
    this.messege='';
  }
}

export interface Imessege{
  name:string;
  email:String;
  messege:string;
}