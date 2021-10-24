package com.psychedelicairlines.Passenger;

import com.psychedelicairlines.Database.DatabaseBookingDetail;
import com.psychedelicairlines.Flights.FlightBookingService;
import com.psychedelicairlines.Flights.FlightCountry;

import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class PassengerService {
   // Passenger passenger1 = new Passenger({this.name});

    public void enterPassengerDetails(){

        ArrayList<String> passengerArrayList = new ArrayList<String>();
        for (int i = 0; i < 3; i++){
        Scanner details = new Scanner(System.in);
        System.out.println("Prove you're not a robot, Enter your Destination: ");
        String country1 = details.nextLine();
        FlightCountry country = FlightCountry.valueOf(country1.toUpperCase(Locale.ROOT));

        System.out.println("Please enter your name:");
        String name = details.nextLine();
        //Passenger passenger1 = new Passenger(name);
        System.out.println("Please enter your email:");
        String email = details.nextLine();

        System.out.println("Please enter your gender:");
        String gender1 = details.nextLine();
        Gender gender = Gender.valueOf(gender1.toUpperCase(Locale.ROOT));

        System.out.println("Please enter your Passport Number:");
        String passport = details.nextLine();

        System.out.println("Please enter your Phone Number:");
        Integer mobile = details.nextInt();

        System.out.println("");



//        FlightBookingService service = new FlightBookingService();
//        FlightCountry country = service.getCountry();

        ID idGenerate = new ID();
        StringBuilder id = idGenerate.generateId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 6);

        //show all of the flight details and passenger details and ideally send this all in an email to user:
        System.out.println("");
        System.out.println("Here are your personal details:");
        System.out.println("");


//        ArrayList<String> passengerArrayList = new ArrayList<String>();
//        for (int i = 0; i < 20; i++){
            Passenger passengeri = new Passenger(country, name, email, gender, mobile, passport, id);
            //System.out.println(passengeri.toString());
            passengerArrayList.add(passengeri.toString());
        }

//        Passenger passenger = new Passenger(country, name, email, gender, mobile, passport, id);
//        //ask nelson - Why is country = null? Why is it attached to ID?
//
        String[] passengerArray = new String[20];
//
//
//        ArrayList<String> passengerArrayList = new ArrayList<String>();
//        passengerArrayList.add(passenger.toString());

        for (int i = 0; i < 3; i++){
        passengerArray[i] = passengerArrayList.get(i);

       System.out.println(passengerArray[i]);}


        //System.out.println(passenger.toString());


         }



    }


