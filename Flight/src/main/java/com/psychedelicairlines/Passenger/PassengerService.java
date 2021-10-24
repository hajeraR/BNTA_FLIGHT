package com.psychedelicairlines.Passenger;

import com.psychedelicairlines.Flights.FlightBookingService;

import java.util.Scanner;

public class PassengerService {
   // Passenger passenger1 = new Passenger({this.name});

    public void enterPassengerDetails(){

        Scanner details = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = details.nextLine();
        //Passenger passenger1 = new Passenger(name);
        System.out.println("Please enter your email:");
        String email = details.nextLine();

        System.out.println("Please enter your gender:");
        String gender1 = details.nextLine();
        Gender gender = Gender.valueOf(gender1);

        System.out.println("Please enter your Passport Number:");
        String passport = details.nextLine();

        System.out.println("Please enter your Phone Number:");
        Integer mobile = details.nextInt();

        System.out.println("");
        ID id = new ID();
        System.out.println("Booking ID:");
        id.generateId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 6);

        //show all of the flight details and passenger details and ideally send this all in an email to user:
        System.out.println("");
        System.out.println("Here are your personal details:");
        System.out.println("");
        Passenger passenger = new Passenger(name, email, gender, mobile, passport);
        System.out.println( passenger.toString());





    }

}
