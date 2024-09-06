package com.anudip.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        System.out.println("Enter string value");
        ArrayList<Character> list = new ArrayList<Character>();
        String str = new Scanner(System.in).nextLine();
//        char[] arr = new char[str.length()];
//        System.out.println(list);
//        for (char ch : arr){
//            System.out.print(ch);
//        }
        outer:
        for(int i=0;i<str.length();i++){
           for(int j=i+1;j<str.length();j++){
               if(str.charAt(i)==str.charAt(j)){
                   System.out.println(str.charAt(i));
                   continue outer;
               }
           }
           list.add(str.charAt(i));
        }
        System.out.println(list);

    }
}
