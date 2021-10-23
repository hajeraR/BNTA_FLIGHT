package com.psychedelicairlines.Passenger;

import java.util.Random;

public class ID {


    public static void generateId(String idChars, int length) {
       // String idChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//            int length = 6;
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(idChars.charAt(random.nextInt(idChars
                    .length())));
        }

        //return sb.toString();
        System.out.println(sb.toString());
    }
}








