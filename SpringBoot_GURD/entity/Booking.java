package com.TKA.SpringBoot_GURD.entity;



import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookings")
public class Booking {
	 @Id
	    //@GeneratedValue(strategy = GenerationType.IDENTITY) // ❌ REMOVE THIS if manually sending
	    @Column(name = "booking_code")
	    private int bookingCode;

	    @Column(name = "hall_id")
	    private int hallId;

	    @Column(name = "hall_name")
	    private String hallName;

	    private String address;
	    private String username;

	    @Column(name = "adhaar_no")
	    private long adhaar_no;

	    @Column(name = "phone_no")
	    private long phone_no;

	    @Column(name = "booking_date")
	    private Date booking_date;

	    private String event;

	    @Column(name = "number_of_days")
	    private int number_of_days;

	    // Getters and setters
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int booking_code, int hall_id, String hall_name, String username, long phone_no, long adhaar_no,
			String address, Date booking_date, String event, int number_of_days) {
		super();
		this.bookingCode = booking_code;
		this.hallId = hall_id;
		this.hallName = hall_name;
		this.username = username;
		this.phone_no = phone_no;
		this.adhaar_no = adhaar_no;
		this.address = address;
		this.booking_date = booking_date;
		this.event = event;
		this.number_of_days = number_of_days;
	}
	public int getBooking_code() {
		return bookingCode;
	}
	public void setBooking_code(int booking_code) {
		this.bookingCode = booking_code;
	}
	public int getHall_id() {
		return hallId;
	}
	public void setHall_id(int hall_id) {
		this.hallId = hall_id;
	}
	public String getHall_name() {
		return hallName;
	}
	public void setHall_name(String hall_name) {
		this.hallName = hall_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public long getAdhaar_no() {
		return adhaar_no;
	}
	public void setAdhaar_no(long adhaar_no) {
		this.adhaar_no = adhaar_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(Date booking_date) {
		this.booking_date = booking_date;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public int getNumber_of_days() {
		return number_of_days;
	}
	public void setNumber_of_days(int number_of_days) {
		this.number_of_days = number_of_days;
	}
	@Override
	public String toString() {
		return "Booking [booking_code=" + bookingCode + ", hall_id=" + hallId + ", hall_name=" + hallName
				+ ", username=" + username + ", phone_no=" + phone_no + ", adhaar_no=" + adhaar_no + ", address="
				+ address + ", booking_date=" + booking_date + ", event=" + event + ", number_of_days=" + number_of_days
				+ "]";
	}

    
    
   
}
