package com.budgetairlines;

import com.budgetairlines.Flights.FlightBookingService;
import com.budgetairlines.Passenger.Gender;
import com.budgetairlines.Passenger.ID;
import com.budgetairlines.Passenger.Passenger;
import com.budgetairlines.Passenger.PassengerService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ID id = new ID();
        id.generateId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 6);

      FlightBookingService flightBookingService=new FlightBookingService();
      PassengerService passengerService = new PassengerService();

      Passenger[] passengers = new Passenger[5];


      flightBookingService.startBooking();

//      ID id = new ID();
//        Passenger passenger1 = new Passenger("Hajera","hajera@bnta.com", Gender.FEMALE,0740303030, "ab1234567");
//        System.out.println(passenger1.toString());
//
////        id.generateId();

    }



}





