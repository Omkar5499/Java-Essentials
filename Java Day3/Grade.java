package com.day3;
import java.util.Scanner;

public class Grade {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, m4, m5;
        double total, percentage;

        System.out.println("\n*****Enter Marks out of 100*****");
        System.out.print("Enter m1 marks: ");
        m1 = sc.nextInt();
        System.out.print("Enter m2 marks: ");
        m2 = sc.nextInt();
        System.out.print("Enter m3 marks: ");
        m3 = sc.nextInt();
        System.out.print("Enter m4 marks: ");
        m4 = sc.nextInt();
        System.out.print("Enter m5 marks: ");
        m5 = sc.nextInt();

        total = m1 + m2 + m3 + m4 + m5;
        percentage = (total / 500.0) * 100;

        System.out.println("\nPercentage = " + percentage);

        if (percentage > 80) {
            System.out.println("Your Grade is: A");
        } else if (percentage > 70 && percentage <= 80) {
            System.out.println("Your Grade is: B");
        } else if (percentage > 60 && percentage <= 70) {
            System.out.println("Your Grade is: C");
        } else if (percentage > 50 && percentage <= 60) {
            System.out.println("Your Grade is: D");
        } else if (percentage >= 40 && percentage <= 50) {
            System.out.println("Your Grade is: E");
        } else {
            System.out.println("Your Grade is: F");
        }

    }
}
