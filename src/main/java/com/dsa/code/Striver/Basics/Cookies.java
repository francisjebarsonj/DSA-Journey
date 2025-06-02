package com.dsa.code.Striver.Basics;

// Understanding classes Before stepping into LinkedList.

public class Cookies {

    private String color;

    public Cookies(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }
}

class Factory {

    public static void main(String[] arg){

        Cookies cookies1 = new Cookies("Green");

        System.out.println("Cookie 1:"+cookies1.getColor());

        Cookies cookies2 = new Cookies("Red");

        System.out.println("Cookie 2:"+cookies2.getColor());

        System.out.println("Modifying Cookie 2 to Pink with setColor() method");

        cookies2.setColor("Pink");

        System.out.println("Printing Cookie 2 after modification!");

        System.out.println("Cookie 2:"+cookies2.getColor());

    }
}
