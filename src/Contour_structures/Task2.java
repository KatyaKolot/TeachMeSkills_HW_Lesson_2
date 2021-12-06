package Contour_structures;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month number from 1 to 12:");
        int month = in.nextInt();
        if (month == 12) {
            System.out.println("Winter");
        } else if (month == 1) {
            System.out.println("Winter");
        } else if (month == 2) {
            System.out.println("Winter");
        } else if (month == 3) {
            System.out.println("Spring");
        } else if (month == 4) {
            System.out.println("Spring");
        } else if (month == 5) {
            System.out.println("Spring");
        } else if (month == 6) {
            System.out.println("Summer");
        } else if (month == 7) {
            System.out.println("Summer");
        } else if (month == 8) {
            System.out.println("Summer");
        } else if (month == 9) {
            System.out.println("Autumn");
        } else if (month == 10) {
            System.out.println("Autumn");
        } else if (month == 11) {
            System.out.println("Autumn");
        }  else {
                System.out.print("Invalid input, please enter number from 1  to 12");
            }
        }
    }

