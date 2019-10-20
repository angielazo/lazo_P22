import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Lazo_p1 {



        // METHOD 1: To create random variable 1
        public static int RandomCreate1(int level){

            // Setting up secure random
            SecureRandom num = new SecureRandom();

            // initializing variables
            int i =0;
            int num1 = 0;

            if (level == 1) {
                // Creating for loop to get a single digit variable
                for (i = 0; i < 10; ++i) {

                    // making it so the bound is only single digits
                    num1 = num.nextInt(9) + 1;

                }
            }
            else if (level == 2){
                for (i = 10; i < 100; ++i) {

                    // making it so the bound is only single digits
                    num1 = num.nextInt(90) + 10;

                }
            }
            else if (level == 3){
                for (i = 100; i < 1000; ++i) {

                    // making it so the bound is only single digits
                    num1 = num.nextInt(900) + 100;

                }
            }
            else if (level == 4){
                for (i = 1000; i < 10000; ++i) {

                    // making it so the bound is only single digits
                    num1 = num.nextInt(9000) + 1000;

                }
            }

            // returning value obtained
            return num1;
        }

        public static int RandomCreate2(int level){

            SecureRandom num = new SecureRandom();
            int i =0;
            int num2 = 0;

            if (level == 1) {
                // Creating for loop to get a single digit variable
                for (i = 0; i < 10; ++i) {

                    // making it so the bound is only single digits
                    num2 = num.nextInt(9) + 1;

                }
            }
            else if (level == 2){
                for (i = 10; i < 100; ++i) {

                    // making it so the bound is only single digits
                    num2 = num.nextInt(90) + 10;

                }
            }
            else if (level == 3){
                for (i = 100; i < 1000; ++i) {

                    // making it so the bound is only single digits
                    num2 = num.nextInt(900) + 100;

                }
            }
            else if (level == 4){
                for (i = 1000; i < 10000; ++i) {

                    // making it so the bound is only single digits
                    num2 = num.nextInt(9000) + 1000;

                }
            }
            return num2;
        }

        // RESPONSE METHOD
        // This method will give the user the initial responses
        public static int Responses(double userIn1, double correctR1) {

            // generating random number
            Random rand = new Random();

            // initializing arrays with possible answers
            String possibleCorrectR[] = {"Very good!", "Excellent!","Nice work!","Keep up the good work!"};
            String possibleWrong[] = {"No. Please try again.","Wrong. Try once more.", "Don’t give up!", "No. Keep trying."};

            // setting a random number of 0,1,2,3 and declaring variables
            int randNum = rand.nextInt(4);
            int i=0;
            int countRight=0;
            int countWrong=0;

            // if responses were correct
            if (Math.abs(correctR1-userIn1)< 0.001) {

                countRight++;

                switch (randNum) {

                    case 0:
                        System.out.println(possibleCorrectR[0]);
                        break;

                    case 1:
                        System.out.println(possibleCorrectR[1]);
                        break;

                    case 2:
                        System.out.println(possibleCorrectR[2]);
                        break;

                    case 3:
                        System.out.println(possibleCorrectR[3]);
                        break;

                }

            } else {

                switch (randNum) {

                    case 0:
                        System.out.println(possibleWrong[0]);
                        break;

                    case 1:
                        System.out.println(possibleWrong[1]);
                        break;

                    case 2:
                        System.out.println(possibleWrong[2]);
                        break;

                    case 3:
                        System.out.println(possibleWrong[3]);
                        break;
                }

            }


            return countRight;
        }

        public static void Questions(){

            String nextYN="Y";

            while(nextYN.equals("Y")) {
                // Setting up scanner
                Scanner scnr = new Scanner(System.in);
                int i = 0;
                int count = 0;
                double correctResponse = 0;

                System.out.println("Please select a difficulty level from 1-4 (1 being easiest, and 4 being hardest).");
                int diffLevel = scnr.nextInt();

                System.out.println("Please select an arithmetic problem to study by selecting a:\n1 for addition only\n2 for multiplication only\n3 for subtraction only\n4 for division only\n5 for random mixture of all\n");
                int probType = scnr.nextInt();

                RandomCreate1(diffLevel);
                RandomCreate2(diffLevel);

                for (i = 0; i < 10; ++i) {
                    // initializing random variables to be created from these two methods
                    int rand1 = RandomCreate1(diffLevel);
                    int rand2 = RandomCreate2(diffLevel);


                    // Printing out Original question
                    if (probType == 1) {
                        System.out.println("How much is " + rand1 + " + " + rand2 + "?");
                        correctResponse = rand1 + rand2;
                    } else if (probType == 2) {
                        System.out.println("How much is " + rand1 + " x " + rand2 + "?");
                        correctResponse = rand1 * rand2;
                    } else if (probType == 3) {
                        System.out.println("How much is " + rand1 + " - " + rand2 + "?");
                        correctResponse = rand1 - rand2;
                    } else if (probType == 4) {
                        System.out.println("How much is " + rand1 + " / " + rand2 + "?\nTo 3 decimal places.");
                        correctResponse = 1.0 * rand1 / rand2;
                    } else if (probType == 5) {
                        Random rand = new Random();
                        int randNum = rand.nextInt(4);


                        switch (randNum) {

                            case 0:
                                System.out.println("How much is " + rand1 + " - " + rand2 + "?");
                                correctResponse = rand1 - rand2;
                                break;

                            case 1:
                                System.out.println("How much is " + rand1 + " + " + rand2 + "?");
                                correctResponse = rand1 + rand2;
                                break;

                            case 2:
                                System.out.println("How much is " + rand1 + " * " + rand2 + "?");
                                correctResponse = rand1 * rand2;
                                break;

                            case 3:
                                System.out.println("How much is " + rand1 + " / " + rand2 + "?\nTo 3 decimal places.");
                                correctResponse = 1.0* rand1 / rand2;
                                break;

                        }
                    }

                    // Collecting initial response
                    double userResponse = scnr.nextDouble();


                    if (Math.abs(correctResponse - userResponse) < 0.001) {
                        count = ++count;
                    }

                    // Sending over variables to method Correct1
                    Responses(userResponse, correctResponse);

                }
                double percentcorrect = (count / 10.0);

                System.out.println("\nPercent correct: " + percentcorrect * 100 + "%\n\nNumber correct: " + count + "\n");

                if (percentcorrect < 0.75) {
                    System.out.println("Please ask your teacher for extra help.");
                } else {
                    System.out.println("Congratulations, you are ready to go to the next level!");

                }

                System.out.println("\nWould you like to proceed to the next level?\nType Y for yes, N for no.");
                nextYN = scnr.next();
            }

            return;

        }




        public static void main(String[] args) {


            Questions();


        }
    }
