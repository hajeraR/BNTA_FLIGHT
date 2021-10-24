package com.psychedelicairlines.Passenger;

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
        System.out.println("Flight Confirmed! Here are your booking details:");
        System.out.println("");

        Passenger passenger = new Passenger(name, email, gender, mobile, passport);
        System.out.println( passenger.toString());
        //print flight details in a string.

        System.out.println("");
        System.out.println("Thank you for taking part in the Psychedelic Airlines Experience!");




    }

//        //Booking Flight
//        //Name:
//        System.out.println("Please enter your name:");
//        String name = scanner.nextLine();
//
//        //Email
//        System.out.println("Please enter your email:");
//        String email = scanner.nextLine();
//
//        //Phone Number
//        System.out.println("Please enter your Phone Number:");
//        String mobile = scanner.nextLine();
//
//        //Passport Number
//        System.out.println("Please enter your Passport Number:");
//        String passport = scanner.nextLine();
}
