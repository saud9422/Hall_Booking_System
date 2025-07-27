package com.TKA.SpringBoot_GURD.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Halls {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hall_id")
    private Long hallId;

    private String hallName;
    private String location;
    private int capacity;
    private String amenities;
    private String price;
    
    @Column(name = "image_url")
    private String imageUrl;

	public Halls() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Halls(Long hallId, String hallName, String location, int capacity, String amenities, String price,
			String imageUrl) {
		super();
		this.hallId = hallId;
		this.hallName = hallName;
		this.location = location;
		this.capacity = capacity;
		this.amenities = amenities;
		this.price = price;
		this.imageUrl = imageUrl;
	}

	public Long getHallId() {
		return hallId;
	}

	public void setHallId(Long hallId) {
		this.hallId = hallId;
	}

	public String getHallName() {
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "Halls [hallId=" + hallId + ", hallName=" + hallName + ", location=" + location + ", capacity="
				+ capacity + ", amenities=" + amenities + ", price=" + price + ", imageUrl=" + imageUrl + "]";
	}
	
    
    
	
	

	
}
	