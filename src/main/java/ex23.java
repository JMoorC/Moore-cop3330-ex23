/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);

        System.out.print("Answer with y for yes or n for no\nIs the car silent when you turn the key? ");
        String answer = inScan.next().toLowerCase();
        if (answer.equals("y") ){

            System.out.print("Are the battery terminals corroded? ");
            answer = inScan.next().toLowerCase();
            if (answer.equals("y") ){
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);
            }
            else {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else {

            System.out.print("Does the car make a clicking noise? ");
            answer = inScan.next().toLowerCase();
            if (answer.equals("y") ){
                System.out.println("Charge or Replace the battery and try again.");
                System.exit(0);
            }
            else {

                System.out.print("Does the car crank up but fail to start? ");
                answer = inScan.next().toLowerCase();
                if (answer.equals("y") ){
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else {

                    System.out.print("Does the engine start and then die? ");
                    answer = inScan.next().toLowerCase();
                    if (answer.equals("y") ){

                        System.out.print("Does your car have fuel injection? ");
                        answer = inScan.next().toLowerCase();
                        if (answer.equals("y") ){
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else {
                        System.out.println("Praise the machine spirit and drive.");
                        System.exit(0);
                    }
                }
            }

        }

    }
}