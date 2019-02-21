package com.anusha.programs;

import java.util.Random;

public class AN001_RandomNumber {
    public static void main(String[] args) {
        int counter;
        Random rnum = new Random();
        /* Below code would generate 5 random numbers
         * between 0 and 200.
         */
        System.out.println("Random Numbers:");
        System.out.println("***************");
        for (counter = 1; counter <= 5; counter++) {
            System.out.println(rnum.nextInt(200));
        }
    }
}
