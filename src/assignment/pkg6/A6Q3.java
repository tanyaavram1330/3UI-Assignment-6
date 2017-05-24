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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creating a scanner for user input
        Scanner input = new Scanner(System.in);

        //telling the user what the program does and how it'll work.
        System.out.println("Within this program you'll be able to input"
                + " 2 numbers to file A.");
        System.out.println("Then all the numbers will be rearranged into "
                + "the order from lowest to highest.");

        //telling the program that the user can only input 2 numbers
        int number = 2;

        //making the 'A' int into the int for the rest of the code to work
        int[] A = new int[number];

        //blank space + asking the user what numbers to type in
        System.out.println("");
        System.out.println("What are the numbers?");

        //allowing the user to input how many numbers they want to type
        for (int i = 0; i < number; i++) {
            A[i] = input.nextInt();
        }

        //rearranging the numbers
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                int temp = A[i];
                int temp2 = A[i + 1];
                A[i + 1] = temp;
                A[i] = temp2;
            }
        }

        //outputting the numbers rearanged for the user to see
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
