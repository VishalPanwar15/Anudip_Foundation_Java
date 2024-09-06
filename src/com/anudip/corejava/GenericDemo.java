package com.anudip.corejava;
class Student<type,type1>{
type name;
type1 roll;
}

public class GenericDemo {
    public static void main(String[] args) {
        Student<String,Integer> student = new Student<>();
        student.roll = 1012;
        student.name="Vishal";
        System.out.println(student.name+" "+student.roll);
    }
}
