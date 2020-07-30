package com.example.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="FlightDetails")
public class FlightDetails {

	
	@Id
	private long flightNumber;
	
	private String airplaneName;
	
	
	private LocalDateTime depatureTime;
	
	
	private LocalDateTime arrivalTime;
	
	private int stops;
	
	private int price;
	
	private String sourceCity;
	
	private String destinationCity;

	public long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirplaneName() {
		return airplaneName;
	}

	public void setAirplaneName(String airplaneName) {
		this.airplaneName = airplaneName;
	}

	public LocalDateTime getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(LocalDateTime depatureTime) {
		this.depatureTime = depatureTime;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getStops() {
		return stops;
	}

	public void setStops(int stops) {
		this.stops = stops;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public FlightDetails(long flightNumber, String airplaneName, LocalDateTime depatureTime, LocalDateTime arrivalTime, int stops,
			int price, String sourceCity, String destinationCity) {
		super();
		this.flightNumber = flightNumber;
		this.airplaneName = airplaneName;
		this.depatureTime = depatureTime;
		this.arrivalTime = arrivalTime;
		this.stops = stops;
		this.price = price;
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
	}
	public FlightDetails() {
		
	}
}
