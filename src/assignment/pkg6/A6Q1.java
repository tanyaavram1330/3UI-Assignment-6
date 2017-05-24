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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creating a scanner for user input
        Scanner input = new Scanner(System.in);

        //asking the user how many students there is within the classroom
        System.out.println("How many students are there in the class?");

        //allowing the user to input the amount of sudents in their classroom
        int num = input.nextInt();

        //creating an array to simplify the code and calculations
        double[] Grade = new double[num];

        //asking the user what their student's average was.
        System.out.println("What were the grades for these students?");

        //allowing the user to input the grades of their students
        for (int i = 0; i < Grade.length; i++) {
            Grade[i] = input.nextDouble();
        }

        //calculating the average of the class
        //creating the sum double of the grades
        double sum = 0;

        //claculating the sum of the grades
        for (int i = 0; i < Grade.length; i++) {
            sum = sum + Grade[i];
        }

        //calculating the average of the classroom.
        double avg = sum / num;

        //rounding up the calculation so then the decimal isn't long
        avg = Math.round(avg * 100) / 100.0;

        //telling the user their classroom's average.
        System.out.println("The class average is " + avg + "%");
    }

}
