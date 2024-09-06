package com.anudip.polymorphism;

class HillStation{
    public void location(){
        System.out.println("Hill Station");
    }
    public void famousFor(){
        System.out.println("Hill Station method");
    }
}
class Manali extends HillStation{

//    to override the Hill station location method


    @Override
    public void location() {
        System.out.println("Manali is located at Kullu district of Himachal Pradesh, India");
    }

    @Override
    public void famousFor() {

    }
}

public class LabQuestion3 {
}
