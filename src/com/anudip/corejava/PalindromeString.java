package com.anudip.corejava;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String str  = new Scanner(System.in).nextLine();
        char[] arr = new char[str.length()];
        int count=0;
        for(int i = str.length()-1;i>=0;i--){
            arr[count] = str.charAt(i);
            count++;
        }
        String str2 = new String(arr);
        if(str.equalsIgnoreCase(str2)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
