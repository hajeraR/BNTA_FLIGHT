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
        System.out.println("Option 2: " + madagascar.getDestination().toString() + "\n" + madagascar.getDate().toString() + "\n" + "£" + madagascar.getPrice().toString());
        System.out.println("Option 3: " + saudi.getDestination().toString() + "\n" + saudi.getDate().toString() + "\n" + "£" + saudi.getPrice().toString());
        System.out.println("Option 4: " + australia.getDestination().toString() + "\n" + australia.getDate().toString() + "\n" + "£" + australia.getPrice().toString());

        Scanner scanner = new Scanner(System.in);
        String flight = scanner.nextLine();

        switch(flight) {
            case "1":
                System.out.println(peru.getFlightName().toString() + "\n" + peru.getFlightDescription().toString() + "\n"+ "£" + peru.getPrice().toString());
                break;
            case "2":
                System.out.println(madagascar.getFlightName().toString() + "\n" + madagascar.getFlightDescription().toString() + "\n" + "£" + madagascar.getPrice().toString());
                break;
            case "3":
                System.out.println(saudi.getFlightName().toString()+ "\n" + saudi.getFlightDescription().toString() + "\n" + "£" + saudi.getPrice().toString());
                break;
            case "4":
                System.out.println(australia.getFlightName().toString() + "\n" + australia.getFlightDescription().toString() + "\n" + "£" + australia.getPrice().toString());
                break;

    }

    
        }
}



