package org.example;

import java.util.Random;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        boolean workingOnInput = true;


        boolean rolling =true;
    do{
        int rollA = 1;
        int rollB = 2;
        int rollC = 3;
        System.out.printf("| %-4s | %-4s | %4s || %-4s | %-4s  %n", "Roll", "Die 1", "Die 2", "Die 3", "Sum");
        System.out.printf("--------------------------------%n");

        for (int i = 1; rollA != rollB || rollB != rollC || rollC != rollA; i++) {
            rollA = rand.nextInt(6)+1;
            rollB = rand.nextInt(6)+1;
            rollC = rand.nextInt(6)+1;

            int rollSum = rollA+rollB+rollC;

            System.out.printf("| %-4s | %-4s | %4s || %-4s | %-4s  %n", i, rollA,  rollB, rollC, rollSum);
        }


        do {
            workingOnInput = true;
            System.out.print("Do you want to roll again [Y,N]: ");
            String playAgain = in.nextLine().toUpperCase();
            if(playAgain.equals("Y")){
                workingOnInput = false;
            } else if(playAgain.equals("N")){
                workingOnInput = false;
                rolling = false;
            } else {
                System.out.println("Invalid choice '" + rolling + "' must be Y or N.");
            }
        } while (workingOnInput);
    } while (rolling);
    }
}
