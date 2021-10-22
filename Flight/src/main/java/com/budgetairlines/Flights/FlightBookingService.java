package com.budgetairlines.Flights;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class FlightBookingService {

    FlightDetails peru = new FlightDetails("Llama", "We ran out of money...", "PE-234", FlightCountry.PERU, FlightCountry.ENGLAND, LocalDateTime.of(2021, Month.NOVEMBER, 12, 13, 47), 957.00, 20, 0);

    FlightDetails madagascar = new FlightDetails("Seaplane Seabird", "Re-purposed from WW2. Book at own risk. BYOB.", "SS-001", FlightCountry.MADAGASCAR, FlightCountry.ENGLAND, LocalDateTime.of(2021, Month.JUNE, 20, 10, 30), 2300.00, 12, 0);

    FlightDetails australia = new FlightDetails("Down Under", "A really, really, really long flight!", "DU-123", FlightCountry.AUSTRALIA, FlightCountry.ENGLAND, LocalDateTime.of(2021, 12, 21 ,13, 30), 800.00, 10, 0);

    FlightDetails saudi = new FlightDetails("Pilgrimage to Mecca","Enter at own risk, women cannot drive!", "SA-232",FlightCountry.SAUDI,FlightCountry.ENGLAND, LocalDateTime.of(2022, 03, 12 ,12, 30), 900.0,75,0);


    public void displayFlights(){
        System.out.println("Option 1: " + peru.getDestination().toString() + "\n" + peru.getDate().toString() + "\n" + "£" + peru.getPrice().toString());
        System.out.println("");

        System.out.println("Option 2: " + madagascar.getDestination().toString() + "\n" + madagascar.getDate().toString() + "\n" + "£" + madagascar.getPrice().toString());
        System.out.println("");

        System.out.println("Option 3: " + saudi.getDestination().toString() + "\n" + saudi.getDate().toString() + "\n" + "£" + saudi.getPrice().toString());
        System.out.println("");

        System.out.println("Option 4: " + australia.getDestination().toString() + "\n" + australia.getDate().toString() + "\n" + "£" + australia.getPrice().toString());

        Scanner scanner = new Scanner(System.in);
        String flight = scanner.nextLine();

        switch(flight) {

            case "1":
                System.out.println("Flight Name: " + peru.getFlightName().toString() + "\n" + "Description: " + peru.getFlightDescription().toString() + "\n"+ "Price: £" + peru.getPrice().toString());

                System.out.println("\n Option 1: Book Now \n Option 2: Cancel");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("Go to Passenger Service Methods");
                    case "2":
                        break;
                }
                break;


            case "2":
                System.out.println("Flight Name: " + madagascar.getFlightName().toString() + "\n" + "Description: " + madagascar.getFlightDescription().toString() + "\n" + "Price: £" + madagascar.getPrice().toString());

                System.out.println("\n Option a: Book Now \n Option b: Cancel");
                String choice2 = scanner.nextLine();
                switch (choice2) {
                    case "1":
                        System.out.println("Go to Passenger Service Methods");
                    case "2":
                        break;
                }
                break;

            case "3":
                System.out.println("Flight Name: " + saudi.getFlightName().toString()+ "\n" + "Description: " + saudi.getFlightDescription().toString() + "\n" + "Price: £" + saudi.getPrice().toString());
                System.out.println("\n Option a: Book Now \n Option b: Cancel");
                String choice3 = scanner.nextLine();
                switch (choice3) {
                    case "1":
                        System.out.println("Go to Passenger Service Methods");
                    case "2":
                        break;
                }
                break;

            case "4":
                System.out.println("Flight Name: " + australia.getFlightName().toString() + "\n" + "Description: " + australia.getFlightDescription().toString() + "\n" + "Price: £" + australia.getPrice().toString());

                System.out.println("\n Option a: Book Now \n Option b: Cancel");
                String choice4 = scanner.nextLine();
                switch (choice4) {
                    case "1":
                        System.out.println("Go to Passenger Service Methods");
                    case "2":
                        break;
                }
                break;

    }

    }
}



