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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creating a scanner for user input
        Scanner input = new Scanner(System.in);

        //telling the user what the program does and how it'll work.
        System.out.println("Within this program you'll be able to input"
                + " any amount of grades;");
        System.out.println("then it'll calculate the median and the average for you.");

        //blank space + asking the user how many grades that they are gonig
        //to input or going to write.
        System.out.println("");
        System.out.println("How many students are there?");

        //allowing the user to input how many grades that they are going to write.
        int number = input.nextInt();

        //how many grades they are going to input
        int[] A = new int[number];

        //blank space + asking the user what grades to type in
        System.out.println("");
        System.out.println("What are their grades?");

        //allowing the user to input how many grades they want to type
        for (int i = 0; i < number; i++) {
            A[i] = input.nextInt();
        }

        //to rearrange a series the grades into order
        for (int j = 0; j < A.length - 1; j++) {
            //rearranging the numbers
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] > A[i + 1]) {
                    int temp = A[i];
                    int temp2 = A[i + 1];
                    A[i + 1] = temp;
                    A[i] = temp2;
                }
            }
        }

        //calculating the average of the class
        //creating the sum double of the grades
        int sum = 0;

        //blank spaces
        System.out.println("");
        System.out.println("");

        //out putting the lowest and highest mark
        System.out.println("The lowest and highest mark is:");
        System.out.println(A[0] + " " + A[A.length - 1]);

        //calculating the sum of the grades
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }

        //calculating the average of the classroom.
        double avg = sum / number;

        //rounding up the calculation so then the decimal isn't long
        avg = Math.round(avg * 100) / 100.0;

        //blank space
        System.out.println("");

        //telling the user their classroom's average.
        System.out.println("The class average is " + avg + "%");
    }

}
