package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter days total: ");
        double days = scan.nextDouble();
        System.out.print("\nEnter days absent: ");
        double absent = scan.nextDouble();


        double percentageAbsent = (absent/days)*100;
        double percentageHere = (100.0-percentageAbsent);
        System.out.print("\n\nYou have been in school: " + percentageHere);
        System.out.print("\n\nYou have been absent: " + percentageAbsent);
        scan.close();
    }
}