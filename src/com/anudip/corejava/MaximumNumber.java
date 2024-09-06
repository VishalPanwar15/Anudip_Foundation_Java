package com.anudip.corejava;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int first_Value = scanner.nextInt();
        System.out.println("Enter second number");
        int second_Value = scanner.nextInt();

        int maximum = first_Value > second_Value ? first_Value : second_Value;
        System.out.println("Maximum value between "+ first_Value +" and "+ second_Value +" is "+maximum);
    }
}
