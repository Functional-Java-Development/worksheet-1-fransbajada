package com.gig;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        // Task A
        Integer[] intArray = new Integer[100];
        Random rand = new Random();

//        Task A - old
//        Arrays.setAll(intArray, num -> {
//            return rand.nextInt(50) + 1;
//        });

        //Task B
        Arrays.setAll(intArray, num -> getRandNumbers(rand));

        // Test - print generated array
        // Arrays.stream(intArray).forEach(num -> System.out.println(num));
        // System.out.println("------------------");


        // Task C and D
        Arrays.sort(intArray, (n1, n2) -> {
            if (n1.toString().length() == n2.toString().length()) {
                return n2.compareTo(n1); //for descending order by char length
            }
            return n1.compareTo(n2); //for shortest integer first by int
        });


        // Task E - output result
        for (int ss : intArray) {
            System.out.println(ss);
        }

    }

    // Task B - method
    public static int getRandNumbers(Random rand) {
        return rand.nextInt(50) + 1; //random positive ints assuming max number is 50
    }

}
