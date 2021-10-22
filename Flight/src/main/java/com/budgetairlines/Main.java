package com.budgetairlines;

import com.budgetairlines.Flights.FlightBookingService;
import com.budgetairlines.Passenger.Gender;
import com.budgetairlines.Passenger.ID;
import com.budgetairlines.Passenger.Passenger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlightBookingService flightBookingService=new FlightBookingService();

       //user input
        //Welcome to budgetairlines
        System.out.println("Welcome to Budget Airlines");
        //choose an option from below
        System.out.println("Choose an option from below");
        System.out.println("Option 1 - Book new flight \n Option 2 - Manage Booking \n (1/2)");
        Scanner scanner =new Scanner(System.in);
        String input = scanner.nextLine();
        //switch statements for options (case)
        switch(input){
            case "1":
                //replaced with the methods for each option
                flightBookingService.displayFlights();

                break;
            case "2":
                System.out.println("Add new flight");
                break;
        }
        //logic in those options


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
//
//
//        ID id = new ID();
//        Passenger passenger1 = new Passenger("Hajera","hajera@bnta.com", Gender.FEMALE,0740303030, "ab1234567");
//        System.out.println(passenger1.toString());
//
////        id.generateId();

    }



}





