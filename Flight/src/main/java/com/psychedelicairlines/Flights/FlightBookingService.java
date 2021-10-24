package com.psychedelicairlines.Flights;

import com.psychedelicairlines.Passenger.PassengerService;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;



public class FlightBookingService {



    private FlightCountry country;

//    public FlightBookingService(FlightCountry country) {
//        this.country = country;
//    }

    @Override
    public String toString() {
        return "FlightBookingService{" +
                "country=" + country +
                ", peru=" + peru +
                ", madagascar=" + madagascar +
                ", australia=" + australia +
                ", saudi=" + saudi +
                ", passengerService=" + passengerService +
                '}';
    }

    FlightDetails peru = new FlightDetails("Llama", "We ran out of money...", "PE-234", FlightCountry.PERU, FlightCountry.ENGLAND, LocalDateTime.of(2021, Month.NOVEMBER, 12, 13, 47), 957.00, 20, 0);

    FlightDetails madagascar = new FlightDetails("Seaplane Seabird", "Re-purposed from WW2. Book at own risk. BYOB.", "SS-001", FlightCountry.MADAGASCAR, FlightCountry.ENGLAND, LocalDateTime.of(2021, Month.JUNE, 20, 10, 30), 2300.00, 20, 0);

    FlightDetails australia = new FlightDetails("Down Under", "A really, really, really long flight!", "DU-123", FlightCountry.AUSTRALIA, FlightCountry.ENGLAND, LocalDateTime.of(2021, 12, 21 ,13, 30), 800.00, 20, 0);

    FlightDetails saudi = new FlightDetails("Pilgrimage to Mecca","Enter at own risk, women cannot drive!", "SA-232",FlightCountry.SAUDI,FlightCountry.ENGLAND, LocalDateTime.of(2022, 03, 12 ,12, 30), 900.0,20,0);

    PassengerService passengerService = new PassengerService();

   // FlightBookingService flightBookingService = new FlightBookingService();

    public void startBooking() {

        FlightBookingService flightBookingService = new FlightBookingService();
        System.out.println("");
        System.out.println("Welcome to the Psychedelic Airline experience! Choose an option from below:");
        System.out.println("\n Option 1 - Book new flight \n Option 2 - Manage Booking \n Option 3 - Exit");
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();

        do {
            switch (input) {
                case 1:
                    flightBookingService.displayFlights();
                    break;
                case 2:
                    System.out.println("Manage Booking");
                    break;
                case 3:
                    System.out.println("Exit");
                    System.exit(0);
                    break;


            }
        } while (input <= 2);
    }

    public void displayFlights(){

       FlightBookingService flightBookingService = new FlightBookingService();

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

                System.out.println("\n Option 1: Book Now \n Option 2: Go Back");
                String choice = scanner.nextLine();
                switch (choice) {

                    case "1":
                        if (peru.getBookedSeats() + 1 < peru.getCapacity()){
                            passengerService.enterPassengerDetails();
                            String country = flightBookingService.setCountry(FlightCountry.PERU);
                            System.out.println("");
                            System.out.println("Your flight to " + country + " is confirmed!");
                            System.out.println("");
                            System.out.println("Thank you for taking part in the Psychedelic Airlines Experience!");

                        } else System.out.println("Unable to book, plane is full! You missed out on Peru's 3000 variety potatoes.");
                        System.out.println("");
                        System.out.println("\n Option 1: Book another flight. \n Option 2: Cancel");
                        String option = scanner.nextLine();
                        switch (option) {
                            case "1":
                                flightBookingService.displayFlights();
                                break;

                            case "2":
                                break;

                        }

                        break;

                    case "2":
                        flightBookingService.displayFlights();
                        break;
                }
                break;

            case "2":
                System.out.println("Flight Name: " + madagascar.getFlightName().toString() + "\n" + "Description: " + madagascar.getFlightDescription().toString() + "\n" + "Price: £" + madagascar.getPrice().toString());

                System.out.println("\n Option 1: Book Now \n Option 2: Go Back");
                String choice2 = scanner.nextLine();
                switch (choice2) {

                    case "1":
                        if (madagascar.getBookedSeats() + 1 < madagascar.getCapacity()){
                            passengerService.enterPassengerDetails();
                            String country = flightBookingService.setCountry(FlightCountry.MADAGASCAR);
                            System.out.println("");
                            System.out.println("Your flight to " + country + " is confirmed!");
                            System.out.println("");
                            System.out.println("Thank you for taking part in the Psychedelic Airlines Experience!");
                        } else System.out.println("Plane fully booked! You can no longer mingle with Madagascar's Malagasy giant rat!");
                        System.out.println("");
                        System.out.println("\n Option 1: Book another flight. \n Option 2: Cancel");
                        String option = scanner.nextLine();
                        switch (option) {
                            case "1":
                                flightBookingService.displayFlights();
                                break;

                            case "2":
                                break;

                        }
                        break;

                    case "2":
                        flightBookingService.displayFlights();
                        break;

                }
                break;

            case "3":
                System.out.println("Flight Name: " + saudi.getFlightName().toString()+ "\n" + "Description: " + saudi.getFlightDescription().toString() + "\n" + "Price: £" + saudi.getPrice().toString());

                System.out.println("\n Option 1: Book Now \n Option 2: Go Back");
                String choice3 = scanner.nextLine();
                switch (choice3) {

                    case "1":
                        if (saudi.getBookedSeats() + 1 < saudi.getCapacity()){
                            passengerService.enterPassengerDetails();
                            String country = flightBookingService.setCountry(FlightCountry.SAUDI);
                            System.out.println("");
                            System.out.println("Your flight to " + country + " is confirmed!");
                            System.out.println("");
                            System.out.println("Thank you for taking part in the Psychedelic Airlines Experience!");
                        } else System.out.println("Plane fully booked! Can't taste no Arabian delights. Hah, sucks to be you!");

                        System.out.println("");
                        System.out.println("\n Option 1: Book another flight. \n Option 2: Cancel");
                        String option = scanner.nextLine();
                        switch (option) {
                            case "1":
                                flightBookingService.displayFlights();
                                break;

                            case "2":
                                break;

                        }
                        break;

                    case "2":
                        flightBookingService.displayFlights();
                        break;
                }
                break;

            case "4":
                System.out.println("Flight Name: " + australia.getFlightName().toString() + "\n" + "Description: " + australia.getFlightDescription().toString() + "\n" + "Price: £" + australia.getPrice().toString());

                System.out.println("\n Option 1: Book Now \n Option 2: Go Back");
                String choice4 = scanner.nextLine();
                switch (choice4) {

                    case "1":
                        if (australia.getBookedSeats() + 1 < australia.getCapacity()){
                            passengerService.enterPassengerDetails();
                            String country = flightBookingService.setCountry(FlightCountry.AUSTRALIA);
                            System.out.println("");
                            System.out.println("Your flight to " + country + " is confirmed!");
                            System.out.println("");
                            System.out.println("Thank you for taking part in the Psychedelic Airlines Experience!");
                        } else System.out.println("Plane fully booked! No surfing those beautiful sandy waves for you!");

                        System.out.println("");
                        System.out.println("\n Option 1: Book another flight. \n Option 2: Cancel");
                        String option = scanner.nextLine();
                        switch (option) {
                            case "1":
                                flightBookingService.displayFlights();
                                break;



                            case "2":
                                break;

                        }
                        break;

                    case "2":
                        flightBookingService.displayFlights();
                        break;
                }
                break;

    }

    
        }



    public FlightCountry  getCountry() {
        return country;
    }

    public String setCountry(FlightCountry country) {
        this.country = country;
        //System.out.println(country.toString();
        return country.toString();
    }
}



