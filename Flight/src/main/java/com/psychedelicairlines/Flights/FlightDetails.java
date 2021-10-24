package com.psychedelicairlines.Flights;

import java.time.LocalDateTime;
import java.util.Objects;

public class FlightDetails {

    private String flightName;
    private String flightDescription;
    private String flightNumber;
    private FlightCountry destination;
    private FlightCountry origin;
    private LocalDateTime date;
    private Double price;
    private Integer capacity;
    private Integer bookedSeats;

    public FlightDetails(String flightName, String flightDescription, String flightNumber, FlightCountry destination, FlightCountry origin, LocalDateTime date, Double price, Integer capacity, Integer bookedSeats) {
        this.flightName = flightName;
        this.flightDescription = flightDescription;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.origin = origin;
        this.date = date;
        this.price = price;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightDescription() {
        return flightDescription;
    }

    public void setFlightDescription(String flightDescription) {
        this.flightDescription = flightDescription;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public FlightCountry getDestination() {
        return destination;
    }

    public void setDestination(FlightCountry destination) {
        this.destination = destination;
    }

    public FlightCountry getOrigin() {
        return origin;
    }

    public void setOrigin(FlightCountry origin) {
        this.origin = origin;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(Integer bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    @Override
    public String toString() {
        return "FlightDetails{" +
                "flightName='" + flightName + '\'' +
                ", flightDescription='" + flightDescription + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", destination=" + destination +
                ", origin=" + origin +
                ", date=" + date +
                ", price=" + price +
                ", capacity=" + capacity +
                ", bookedSeats=" + bookedSeats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightDetails that = (FlightDetails) o;
        return Objects.equals(flightName, that.flightName) && Objects.equals(flightDescription, that.flightDescription) && Objects.equals(flightNumber, that.flightNumber) && destination == that.destination && origin == that.origin && Objects.equals(date, that.date) && Objects.equals(price, that.price) && Objects.equals(capacity, that.capacity) && Objects.equals(bookedSeats, that.bookedSeats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightName, flightDescription, flightNumber, destination, origin, date, price, capacity, bookedSeats);
    }
}
