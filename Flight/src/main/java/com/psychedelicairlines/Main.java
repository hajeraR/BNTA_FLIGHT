package com.psychedelicairlines;

import com.psychedelicairlines.Flights.FlightBookingService;
import com.psychedelicairlines.Flights.FlightCountry;
import com.psychedelicairlines.Passenger.Passenger;
import com.psychedelicairlines.Passenger.PassengerService;

public class Main {
    public static void main(String[] args) {

      FlightBookingService flightBookingService=new FlightBookingService();

      PassengerService passengerService = new PassengerService();

      Passenger[] passengers = new Passenger[5];

      flightBookingService.startBooking();

    }
}





