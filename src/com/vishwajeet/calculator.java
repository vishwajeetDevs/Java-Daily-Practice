package com.vishwajeet;

import java.util.*;

public class calculator {
    public static void main (String [] args) {
        char operation;
        int a,b;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Operation (+ , - , * , / ): ");
        operation = input.next().charAt(0);
        System.out.print("Enter the first input : ");
        a = input.nextInt();
        System.out.print("Enter the second input : ");
        b = input.nextInt();


        //old switch method
        switch (operation) {
            case '+' :
                System.out.println ("the sum of given data is : " + (a+b));
                break;
            case '-' :
                System.out.println ("the sum of given data is : " + (a-b));
                break;
            case '*' :
                System.out.println ("the sum of given data is : " + (a*b));
                break;
            case '/' :
                System.out.println ("the sum of given data is : " + (a/b));
                break;
            default:
                System.out.println("please enter the valid operator");
        }
        
        //enhanced switch method :
        switch (operation) {
            case '+' -> {
                System.out.println("the sum of given data is : " + (a + b));
                System.out.println("another statement");
            }
            case '-' -> System.out.println("the sum of given data is : " + (a - b));
            case '*' -> System.out.println("the sum of given data is : " + (a * b));
            case '/' -> System.out.println("the sum of given data is : " + (a / b));
            default -> System.out.println("please enter the valid operator");
        }
    }
}