package org.example;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */

public class App 
{
    public static void main( String[] args )
    {
        final double conv = 0.00285714286;
        System.out.println("What is the length of the room?");
        int length, width, total;
        Scanner input = new Scanner(System.in);
        length = input.nextInt();
        System.out.println("What is the width of the room?");
        width = input.nextInt();
        total = length * width;
        if((total % 350) != 0 ){
            System.out.println("You will need to purchase " + (int)((total*conv) + 1) + " gallons of paint to cover " + total + " square feet.");
        }
        else if( (total / 350) == 1){
            System.out.println("You will need to purchase " + (total/350) + " gallon of paint to cover " + total + " square feet.");
        }
        else{
            System.out.println("You will need to purchase " + (int)(total*conv) + " gallons of paint to cover " + total + " square feet.");
        }
    }
}
