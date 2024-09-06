package com.anudip.corejava;

import java.util.Scanner;

class Bank{
    double amount;
    Bank(double amount){
        this.amount = amount;
    }
    public void withdraw(double withdrawalAmount){
        boolean sufficientBalance = withdrawalAmount < amount ? true : false;
        if(sufficientBalance){
            amount -= withdrawalAmount;
            System.out.println(" Withdraw Successful ");

        }
        else{
            System.out.println(" Withdraw Unsuccessful ");
            return;
        }
    }
    public void deposit(double depositeAmount){
        if(depositeAmount < 0 ){
            System.out.println("Enter non negative value");
            return;
        }
        else{
            amount += depositeAmount;
        }
    }
    public void showBalance(){
        System.out.println("Total Balance :"+amount);
    }
}
public class AccountMain {
    public static void main(String[] args) {
        Bank b = new Bank(10000.00);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Current Balnace :" +b.amount);
        System.out.println("Enter amount you want to witdraw");
        double withdrawAmount = scanner.nextDouble();
        b.withdraw(withdrawAmount);
        b.showBalance();

        System.out.println("Enter amount you want to Deposite");
        double depositeAmount = scanner.nextDouble();
        b.deposit(depositeAmount);
        b.showBalance();

    }
}
