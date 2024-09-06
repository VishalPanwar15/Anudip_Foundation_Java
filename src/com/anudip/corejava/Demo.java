package com.anudip.corejava;

 public class Demo {
    int a = 20;
    int b = 30;
    protected void add(){
        System.out.println("Addition is :"+(a+b));
    }
//     this method is accessible only in same class outside the class it is not accessible
    private void subtract(){
        System.out.println("Difference is :"+(a-b));

    }
    public void multiplication(){
        System.out.println("Multiplication is :"+(a*b));
    }
    void cubeRoot(){
        System.out.println("Cube of "+a+" is "+(a*a*a));
    }
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.subtract();
    }
}
