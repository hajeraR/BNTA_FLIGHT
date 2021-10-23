package com.budgetairlines.Passenger;

import javax.swing.*;
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

        ID passengerID = new ID();

        Passenger passenger1 = new Passenger(name, email, gender, mobile, passport);
        System.out.println(passenger1.toString());
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
