package com.psychedelicairlines.Database;

import com.psychedelicairlines.Flights.FlightBookingService;
import com.psychedelicairlines.Flights.FlightCountry;
import com.psychedelicairlines.Flights.FlightDetails;
import com.psychedelicairlines.Passenger.PassengerService;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class DatabaseBookingDetail {

 PassengerService passengerService = new PassengerService();

 private Object[] peruFlight;
 private Object[] madagascarFlight;
 private Object[] saudiFlight;
 private Object[] australiaFlight;

 public DatabaseBookingDetail(Object[] peruFlight, Object[] madagascarFlight, Object[] saudiFlight, Object[] australiaFlight) {
  this.peruFlight = peruFlight;
  this.madagascarFlight = madagascarFlight;
  this.saudiFlight = saudiFlight;
  this.australiaFlight = australiaFlight;
 }

 public Object[] getPeruFlight() {
  return peruFlight;
 }

 public void setPeruFlight(Object[] peruFlight) {
  this.peruFlight = peruFlight;
 }

 public Object[] getMadagascarFlight() {
  return madagascarFlight;
 }

 public void setMadagascarFlight(Object[] madagascarFlight) {
  this.madagascarFlight = madagascarFlight;
 }

 public Object[] getSaudiFlight() {
  return saudiFlight;
 }

 public void setSaudiFlight(Object[] saudiFlight) {
  this.saudiFlight = saudiFlight;
 }

 public Object[] getAustraliaFlight() {
  return australiaFlight;
 }

 public void setAustraliaFlight(Object[] australiaFlight) {
  this.australiaFlight = australiaFlight;
 }

 @Override
 public String toString() {
  return "DatabaseBookingDetail{" +
          "peruFlight=" + Arrays.toString(peruFlight) +
          ", madagascarFlight=" + Arrays.toString(madagascarFlight) +
          ", saudiFlight=" + Arrays.toString(saudiFlight) +
          ", australiaFlight=" + Arrays.toString(australiaFlight) +
          '}';
 }

 FlightDetails peru = new FlightDetails("Llama", "We ran out of money...", "PE-234", FlightCountry.PERU, FlightCountry.ENGLAND, LocalDateTime.of(2021, Month.NOVEMBER, 12, 13, 47), 957.00, 20, 0);

 FlightDetails madagascar = new FlightDetails("Seaplane Seabird", "Re-purposed from WW2. Book at own risk. BYOB.", "SS-001", FlightCountry.MADAGASCAR, FlightCountry.ENGLAND, LocalDateTime.of(2021, Month.JUNE, 20, 10, 30), 2300.00, 12, 0);

 FlightDetails australia = new FlightDetails("Down Under", "A really, really, really long flight!", "DU-123", FlightCountry.AUSTRALIA, FlightCountry.ENGLAND, LocalDateTime.of(2021, 12, 21 ,13, 30), 800.00, 10, 0);

 FlightDetails saudi = new FlightDetails("Pilgrimage to Mecca","Enter at own risk, women cannot drive!", "SA-232",FlightCountry.SAUDI,FlightCountry.ENGLAND, LocalDateTime.of(2022, 03, 12 ,12, 30), 900.0,75,0);


 //DatabaseBookingDetail databaseBookingDetail = new DatabaseBookingDetail();

 FlightBookingService flightBookingService = new FlightBookingService();


// Object[] peruFlight = new Object[peru.getCapacity()];
// Object[] madagascarFlight = new Object[madagascar.getCapacity()];
// Object[] saudiFlight = new Object[saudi.getCapacity()];
// Object[] australiaFlight = new Object[australia.getCapacity()];




}






