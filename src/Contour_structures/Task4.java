package Contour_structures;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println ("Enter the temperature");
    int t = in.nextInt();

         if (t > -5) {
             System.out.println("Warm");
         }
         else if ( t>-20 && t< -5) {
             System.out.println("Normal");
         }
         else if (t< -20) {
             System.out.println ("Cold");
         }
    }


}
