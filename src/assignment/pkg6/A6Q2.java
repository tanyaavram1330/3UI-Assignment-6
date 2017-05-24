package assignment.pkg6;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anisoaraavram
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creating a scanner for user input
        Scanner input = new Scanner(System.in);

        //telling the user what the average height is
        System.out.println("The average height for a women is 60.40 inches in Canada.");
        System.out.println("The average height for a male is 60.90 inches in Canada.");
        System.out.println("The average height for both together is around "
                + "60.63 inches in Canada.");

        //blank space
        System.out.println("");

        //telling the user what the profram is about
        System.out.println("This program will show you the heights above average.");

        //blank space
        System.out.println("");

        //weither they chose to do male, female, or both. It'll direct the code there
        //to their destination. If not it'll ask them if they want to quite or not.
        while (true) {

            //asking weither they are measureing female, male or both parites.
            System.out.println("Are you measuring female, male, or both heights?");

            //allowing the user to input their answer
            String Gender = input.nextLine();

            //changing the words into lower case
            Gender = Gender.toLowerCase();

            //blank space
            System.out.println("");

            //male heights
            if (Gender.equals("male")) {
                //asking the user how many men are there.
                System.out.println("How many males are there to be measured?");

                //allowing the user to input the amount of the males to be measured
                int num = input.nextInt();

                //creating an array for the amount of people and their measured heights
                double[] Height = new double[num];

                //blank space
                System.out.println("");

                //asking the user what their student's average was. And to put it in inches
                System.out.println("What were the heights for the males? Make sure "
                        + "that it's in inches.");
                System.out.println("Or the calculations won't work.");

                //allowing the user to input the height of the males
                for (int i = 0; i < Height.length; i++) {
                    Height[i] = input.nextDouble();
                }

                //blank spaces
                System.out.println("");
                System.out.println("");

                //telling the user the heights above average
                System.out.println("The heights above average is:");

                //outputting the heights within the program that are above average
                for (int i = 0; i < Height.length; i++) {
                    //if the height is above the average then it outputs the above heights
                    if (Height[i] > 60.90) {
                        System.out.print("|" + Height[i] + " ");
                    }
                }

                //ending the calculations
                break;
            }

            if (Gender.equals("female")) {
                //asking the user how many women are there.
                System.out.println("How many many females are there to be measured?");

                //allowing the user to input the amount of the females to be measured
                int num = input.nextInt();

                //creating an array for the amount of people and their measured heights
                double[] Height = new double[num];

                //blank space
                System.out.println("");

                //asking the user what their average was. And to put it in inches
                System.out.println("What were the heights for the females? Make sure "
                        + "that it's in inches.");
                System.out.println("Or the calculations won't work.");

                //allowing the user to input the heights of the women
                for (int i = 0; i < Height.length; i++) {
                    Height[i] = input.nextDouble();
                }

                //blank spaces
                System.out.println("");
                System.out.println("");

                //telling the user the heights above average
                System.out.println("The heights above average is:");

                //outputting the heights within the program that are above average
                for (int i = 0; i < Height.length; i++) {
                    //if the height is above the average then it outputs the above heights
                    if (Height[i] > 60.40) {
                        System.out.print("|" + Height[i] + " ");
                    }
                }

                //ending the calculations
                break;
            }

            if (Gender.equals("both")) {
                //asking the user how many women are there.
                System.out.println("How many people are there to be measured?");

                //allowing the user to input the amount of them to be measured
                int num = input.nextInt();

                //creating an array for the amount of people and their measured heights
                double[] Height = new double[num];

                //blank space
                System.out.println("");

                //asking the user what their average was. And to put it in inches
                System.out.println("What were the heights for them? Make sure "
                        + "that it's in inches.");
                System.out.println("Or the calculations won't work.");

                //allowing the user to input the heights of the people
                for (int i = 0; i < Height.length; i++) {
                    Height[i] = input.nextDouble();
                }

                //blank spaces
                System.out.println("");
                System.out.println("");

                //telling the user the heights above average
                System.out.println("The heights above average is:");

                //outputting the heights within the program that are above average
                for (int i = 0; i < Height.length; i++) {
                    //if the height is above the average then it outputs the above heights
                    if (Height[i] > 60.63) {
                        System.out.print("|" + Height[i] + " ");
                    }
                }

                //ending the calculations
                break;
            }

            //not allowing the user to type in any other answer than yes or no
            while (!(Gender.equals("male")) || !(Gender.equals("female"))
                    || !(Gender.equals("both"))) {
                //asking the user if they still want to do the program.
                System.out.println("");
                System.out.println("Sorry, doesn't relate to the measurement.");
                System.out.println("Do you still want to continue? Yes or no?");

                //allowing the user to input their answer
                Gender = input.nextLine();

                //changing the words into lower case
                Gender = Gender.toLowerCase();

                //getting out of the while statement and back to the program
                if (Gender.equals("yes")) {
                    break;
                }

                //exiting/ending the program
                if (Gender.equals("no")) {
                    System.exit(0);
                }
            }

        }
    }
}
