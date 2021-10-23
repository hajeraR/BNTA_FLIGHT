package com.budgetairlines.Passenger;

import java.util.Objects;

public class Passenger {
    private ID id;
    private String name;
    private String email;
    private Gender gender;
    private Integer phoneNumber;
//    private Integer id;
    private String passportNumber;


    public Passenger(String name, String email, Gender gender, Integer phoneNumber, String passportNumber) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
//        this.id = id;
        this.passportNumber = passportNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", phoneNumber=" + phoneNumber +

                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(name, passenger.name) && Objects.equals(email, passenger.email) && gender == passenger.gender && Objects.equals(phoneNumber, passenger.phoneNumber)  && Objects.equals(passportNumber, passenger.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, gender, phoneNumber,  passportNumber);
    }
}
