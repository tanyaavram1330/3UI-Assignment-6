/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6;

import java.util.Scanner;

/**
 *
 * @author anisoaraavram
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creating a boolean to state which numbers are true or false
        //the ones that are true are primes, even are false. Also there is an
        //array to store all of the numbers to 1000.
        boolean[] flags = new boolean[1000];

        //telling the user what kind of code and that it's process of primary from 2-1000.
        System.out.println("Within this program it'll go from 2 to 1000 and collect "
                + "all of the primary numbers,");
        System.out.println("and output it towards the user.");

        //stating that all the numbers up to 1000 is true by boolean
        for (int i = 0; i < 1000; i++) {
            flags[i] = true;
        }

        //making all of the prime number true
        for (int i = 2; i < 1000; i++) {
            if (flags[i] == true) {

                //however if there is any additions that isn't prime
                //this code selects all of them
                for (int j = 2; j < 1000; j++) {
                    int even = i * j;

                    //and when they are selected this code turns the statment
                    //into flase. Therefore seperating them from the primes.
                    if (even < 1000) {
                        flags[even] = false;
                    }
                }
            }
        }

        //Showing to the user all of the prime numbers.
        System.out.println("The prime numbers are:");
        //outputting the primes
        for (int prime = 2; prime < 1000; prime++) {
            if (flags[prime] == true) {
                System.out.println(prime + "");
            }
        }
    }
}
