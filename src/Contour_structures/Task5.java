package Contour_structures;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 1-7:");

        int colour = in.nextInt();
        switch (colour) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Indigo");
                break;
            case 7:
                System.out.println("Violet");
                break;
            default:
                System.out.println ("Invalid input, please enter a number between 1-7 ");

        }
} }