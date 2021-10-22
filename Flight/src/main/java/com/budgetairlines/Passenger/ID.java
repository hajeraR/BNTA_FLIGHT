package com.budgetairlines.Passenger;

import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;

public class ID {

    public int generateId() {
        int int_random = ThreadLocalRandom.current().nextInt();
        return (Math.abs(int_random));
    }



}
