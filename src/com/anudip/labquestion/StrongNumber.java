package com.anudip.labquestion;
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter any number ");
        int num = new Scanner(System.in).nextInt();
        int strongNumber=0;
        int fact = 1;
        int sum=0;
        int temp = num;
        while (num>0){
            int remainder = num%10;
            for(int i=fact;i<=remainder;i++){
                fact*=i;
            }
            sum+=fact;
            fact=1;
            num/=10;
        }

        if(sum==temp){
            System.out.println(temp+" is a strong number");
        }
        else{
            System.out.println(temp+" is not strong number");

        }
    }
}

