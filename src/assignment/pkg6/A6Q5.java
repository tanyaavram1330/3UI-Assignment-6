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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creating a scanner for user input
        Scanner input = new Scanner(System.in);

        //telling the user what the program does and how it'll work.
        System.out.println("Within this program you'll be able to input"
                + " any amount of grades;");
        System.out.println("then it'll calculate the median for you.");

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

        //if there is even number then it uses this formula to get the median
        if (number % 2 == 0) {

            //getting the equations to do the final calculation for the median
            int middleNumber = A.length / 2;
            int secondNumber = middleNumber - 1;

            //calculating the final equation for the median
            double total = (A[middleNumber] + A[secondNumber]) / 2.0;

            //telling the user what their final median is
            System.out.println("The median of the grade is " + total);
        } //if there is an odd number then it uses this formula to ge the median
        else if (number % 2 == 1) {
            //claculating the median
            int oddMiddle = A.length / 2;

            //telling the user what their final median is
            System.out.println("The median of the grade is " + A[oddMiddle]);
        }
    }
}
