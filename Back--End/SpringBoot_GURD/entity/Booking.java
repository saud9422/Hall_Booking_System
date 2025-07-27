package com.TKA.SpringBoot_GURD.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @Column(name = "booking_code")
    private int booking_code;

    @Column(name = "hall_id")
    private Long hall_id;

    @Column(name = "hall_name")
    private String hall_name;

    @Column(name = "address")
    private String address;

    @Column(name = "username")
    private String username;

    @Column(name = "adhaar_no")
    private String adhaar_no;

    @Column(name = "phone_no")
    private String phone_no;

    @Column(name = "booking_date")
    private String booking_date;

    @Column(name = "event")
    private String event;

    @Column(name = "number_of_days")
    private int number_of_days;

    // --- Getters & Setters ---

    public int getBooking_code() {
        return booking_code;
    }

    public void setBooking_code(int booking_code) {
        this.booking_code = booking_code;
    }

    public Long getHall_id() {
        return hall_id;
    }

    public void setHall_id(Long hall_id) {
        this.hall_id = hall_id;
    }

    public String getHall_name() {
        return hall_name;
    }

    public void setHall_name(String hall_name) {
        this.hall_name = hall_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdhaar_no() {
        return adhaar_no;
    }

    public void setAdhaar_no(String adhaar_no) {
        this.adhaar_no = adhaar_no;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
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
}
