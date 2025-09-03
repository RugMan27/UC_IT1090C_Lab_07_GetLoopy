package org.example;

public class PartB {
    public static void main(String[] args) {
        //Task 5
        System.out.println("Task 5");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Task 6
        System.out.println("Task 6");
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Task 77
        System.out.println("Task 7");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
