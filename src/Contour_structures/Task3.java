package Contour_structures;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.print ("Enter a number:");
        int num = in.nextInt();
        if ( num%2 !=0) {
            System.out.println ("This is an odd number"); }
        else if (num%2 ==0) {
            System.out.println ("This is an even number"); }

        }
    }

