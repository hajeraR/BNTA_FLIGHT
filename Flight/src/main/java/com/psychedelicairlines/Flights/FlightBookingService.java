package com.psychedelicairlines.Flights;

import com.psychedelicairlines.Passenger.Gender;
import com.psychedelicairlines.Passenger.ID;
import com.psychedelicairlines.Passenger.Passenger;
import com.psychedelicairlines.Passenger.PassengerService;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Locale;
import java.util.Scanner;

public class FlightBookingService {


//    private String country;

    FlightDetails peru = new FlightDetails("Llama", "We ran out of money...", "PE-234", FlightCountry.PERU, FlightCountry.ENGLAND, LocalDateTime.of(2021, Month.NOVEMBER, 12, 13, 47), 957.00, 20, 0);

    FlightDetails madagascar = new FlightDetails("Seaplane Seabird", "Re-purposed from WW2. Book at own risk. BYOB.", "SS-001", FlightCountry.MADAGASCAR, FlightCountry.ENGLAND, LocalDateTime.of(2021, Month.JUNE, 20, 10, 30), 2300.00, 12, 0);

    FlightDetails australia = new FlightDetails("Down Under", "A really, really, really long flight!", "DU-123", FlightCountry.AUSTRALIA, FlightCountry.ENGLAND, LocalDateTime.of(2021, 12, 21 ,13, 30), 800.00, 10, 0);

    FlightDetails saudi = new FlightDetails("Pilgrimage to Mecca","Enter at own risk, women cannot drive!", "SA-232",FlightCountry.SAUDI,FlightCountry.ENGLAND, LocalDateTime.of(2022, 03, 12 ,12, 30), 900.0,75,0);

    PassengerService passengerService = new PassengerService();


    public void startBooking(){

        FlightBookingService flightBookingService = new FlightBookingService();
        System.out.println("");
        System.out.println("Welcome to the Psychedelic Airline experience! Choose an option from below:");
        System.out.println("\n Option 1 - Book new flight \n Option 2 - Manage Booking \n Option 3 - EXIT");
        Scanner scanner =new Scanner(System.in);
        String input = scanner.nextLine();

        switch(input){
            case "1":
                flightBookingService.displayFlights();
                break;
            case "2":
                System.out.println("Manage Booking");
                break;
            case "3":
                System.out.println("Exs--ter--min--ate!");
                System.exit(0);
                break;
        }
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
                            int countPeru = peru.getCapacity();
                            peru.setCapacity(++countPeru);
                            enterPassengerDetailsPeru();

                            String countryPeru = peru.getDestination().toString();
                            System.out.println("");
                            System.out.println("Your flight to " + countryPeru + " is confirmed!");
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
                            int countMadagascar = peru.getCapacity();
                            peru.setCapacity(++countMadagascar);
                            enterPassengerDetailsMadagascar();
                            String countryMadagascar = madagascar.getDestination().toString();
                            System.out.println("");
                            System.out.println("Your flight to " + countryMadagascar + " is confirmed!");
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
                            int count = saudi.getCapacity();
                            saudi.setCapacity(++count);
                            enterPassengerDetailsSaudi();

                            String countrySaudi = saudi.getDestination().toString();
                            System.out.println("");
                            System.out.println("Your flight to " + countrySaudi + " is confirmed!");
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
                            int countAustralia = australia.getCapacity();
                            peru.setCapacity(++countAustralia);
                            enterPassengerDetailsAustralia();

                            String countryAustralia = australia.getDestination().toString();
                            System.out.println("");
                            System.out.println("Your flight to " + countryAustralia + " is confirmed!");
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



    public void enterPassengerDetailsPeru(){
        FlightBookingService flightBookingService = new FlightBookingService();

        Scanner details = new Scanner(System.in);
        System.out.println("Prove you're not a robot; enter your destination");
        String countryPeru1 = details.nextLine();

        if (countryPeru1.toUpperCase(Locale.ROOT).equals("PERU")) {
            //FlightCountry countryPeruDestination = FlightCountry.valueOf(countryPeru1.toUpperCase(Locale.ROOT));
            String countryPeruDestination = countryPeru1.toUpperCase(Locale.ROOT);

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
            ID idGenerate = new ID();
            StringBuilder id = idGenerate.generateId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 6);


            //FlightBookingService service = new FlightBookingService();
            //String country = service.getCountry();

            //show all of the flight details and passenger details and ideally send this all in an email to user:
            System.out.println("");
            System.out.println("Here are your personal details:");
            System.out.println("");
            Passenger passenger = new Passenger(id, countryPeruDestination, name, email, gender, mobile, passport);
            System.out.println(passenger.toString());
            System.out.println("");
            System.out.println("May The Odds Be Ever In Your Favour!");

        } else {
            System.out.println("GOT YA, ROBOT!");
            System.out.println("");
            flightBookingService.startBooking();

        }



    }


    public void enterPassengerDetailsMadagascar() {
        FlightBookingService flightBookingService = new FlightBookingService();

        Scanner details = new Scanner(System.in);
        System.out.println("Prove you're not a robot; enter your destination");
        String countryMadagascar1 = details.nextLine();

        if (countryMadagascar1.toUpperCase(Locale.ROOT).equals("MADAGASCAR")) {
            //FlightCountry countryMadagascarDestination = FlightCountry.valueOf(countryMadagascar1.toUpperCase(Locale.ROOT));
            String countryMadagascarDestination = countryMadagascar1.toUpperCase(Locale.ROOT);

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
            ID idGenerate = new ID();
            StringBuilder id = idGenerate.generateId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 6);


            //FlightBookingService service = new FlightBookingService();
            //String country = service.getCountry();

            //show all of the flight details and passenger details and ideally send this all in an email to user:
            System.out.println("");
            System.out.println("Here are your personal details:");
            System.out.println("");
            Passenger passenger = new Passenger(id, countryMadagascarDestination, name, email, gender, mobile, passport);
            System.out.println(passenger.toString());
            System.out.println("");
            System.out.println("May The Odds Be Ever In Your Favour!");

        } else {
            System.out.println("GOT YA, ROBOT!");
            System.out.println("");
            flightBookingService.startBooking();

        }
    }


        public void enterPassengerDetailsSaudi() {

            FlightBookingService flightBookingService = new FlightBookingService();

            Scanner details = new Scanner(System.in);
            System.out.println("Prove you're not a robot; enter your destination");
            String countrySaudi1 = details.nextLine();

            if (countrySaudi1.toUpperCase(Locale.ROOT).equals("PERU")) {
                //FlightCountry countryPeruDestination = FlightCountry.valueOf(countryPeru1.toUpperCase(Locale.ROOT));
                String countrySaudiDestination = countrySaudi1.toUpperCase(Locale.ROOT);

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
                ID idGenerate = new ID();
                StringBuilder id = idGenerate.generateId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 6);


//                FlightBookingService service = new FlightBookingService();
//                String country = service.getCountry();

                //show all of the flight details and passenger details and ideally send this all in an email to user:
                System.out.println("");
                System.out.println("Here are your personal details:");
                System.out.println("");
                Passenger passenger = new Passenger(id, countrySaudiDestination, name, email, gender, mobile, passport);
                System.out.println(passenger.toString());
                System.out.println("");
                System.out.println("May The Odds Be Ever In Your Favour!");

            } else {
                System.out.println("GOT YA, ROBOT!");
                System.out.println("");
                flightBookingService.startBooking();

            }
        }


    public void enterPassengerDetailsAustralia(){
        FlightBookingService flightBookingService = new FlightBookingService();

                Scanner details = new Scanner(System.in);
                System.out.println("Prove you're not a robot; enter your destination");
                String countryAustralia1 = details.nextLine();

                if (countryAustralia1.toUpperCase(Locale.ROOT).equals("AUSTRALIA")) {
                    //FlightCountry countryPeruDestination = FlightCountry.valueOf(countryPeru1.toUpperCase(Locale.ROOT));
                    String countryAustraliaDestination = countryAustralia1.toUpperCase(Locale.ROOT);

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
                    ID idGenerate = new ID();
                    StringBuilder id = idGenerate.generateId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 6);


                  // FlightBookingService service = new FlightBookingService();
//                    String country = service.getCountry();

                    //show all of the flight details and passenger details and ideally send this all in an email to user:
                    System.out.println("");
                    System.out.println("Here are your personal details:");
                    System.out.println("");
                    Passenger passenger = new Passenger(id, countryAustraliaDestination, name, email, gender, mobile, passport);
                    System.out.println(passenger.toString());
                    System.out.println("");
                    System.out.println("May The Odds Be Ever In Your Favour!");


                } else {
                    System.out.println("GOT YA, ROBOT!");
                    System.out.println("");
                    flightBookingService.startBooking();

                }}

//    public String getCountry() {
//        return country;
//    }
//
//    public void setName(String country) {
//        this.country = country;
//    }
}



