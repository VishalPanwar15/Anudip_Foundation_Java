package com.anudip.polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract  class Vaccine{
    public int age;
    public String nationality;
    public boolean firstDose=false;
    public boolean secondDose = false;
    public Vaccine(int age,String nationality){
        this.age=age;
        this.nationality = nationality;
    }
     public  boolean firstDose(){
        if(nationality.equalsIgnoreCase("Indian") && age >= 18 ){
            System.out.println("You are eligible for first dose");
            System.out.println("Pay to 250Rs");
            System.out.println("Enter an amount");
            int amount = new Scanner(System.in).nextInt();
            if(amount==250){
                System.out.println("Successfully Vaccinated your first dose");
                firstDose = true;
                return firstDose;
            }
            else{
                System.out.println("Please enter 250 for first dose");
                amount = new Scanner(System.in).nextInt();
                if(amount==250){
                    System.out.println("Successfully Vaccinated your first dose");
                    firstDose = true;
                    return firstDose;
                }
            }
        }
        else{
            System.out.println("You are not eligible for vaccination");
        }
         return firstDose;
     }
     public boolean secondDose() {
        if(firstDose){
            System.out.println("You are eligible for second dose");
            System.out.println("Successfully Vaccinated your second dose");
            secondDose = true;
            return secondDose;
        }
        else{
            System.out.println("Sorry You don't take first dose please take first dose after that you are eligible.");
        }
        return secondDose;
    }
    abstract  public void boosterDose();

}
class VaccinationSucceesful extends Vaccine{

    public VaccinationSucceesful(int age,String nationality){
//        to call the abstract class constructor
        super(age, nationality);
    }
    @Override
    public void boosterDose() {
       if (firstDose){
           if (secondDose){
               System.out.println("Your take booster dose");
           }
           else{
               System.out.println("Sorry please complete your second dose");
           }
       }
       else {
           System.out.println("Sorry not eligible complete first two dose");
       }

    }
}

public class Vaccination {
    public static void main(String[] args) throws InterruptedException {
        VaccinationSucceesful vaccinationSucceesful = new VaccinationSucceesful(12,"Indian");
        System.out.println("***** First User Data *****");
       vaccinationSucceesful.firstDose();
       vaccinationSucceesful.secondDose();
        vaccinationSucceesful.boosterDose();
        System.out.println("--------------------");

        System.out.println("***** Second User Data *****");

        VaccinationSucceesful vaccinationSucceesful1 = new VaccinationSucceesful(22,"Indian");
        vaccinationSucceesful1.firstDose();
        vaccinationSucceesful1.secondDose();
        vaccinationSucceesful1.boosterDose();
        System.out.println("--------------------");

        System.out.println("***** Third User Data *****");

        VaccinationSucceesful vaccinationSucceesful2 = new VaccinationSucceesful(22,"Canadian");
        vaccinationSucceesful2.firstDose();
        vaccinationSucceesful2.secondDose();
        vaccinationSucceesful2.boosterDose();

    }
}
