package com.company;

public class Main {

    public static void main(String[] args) {

        House blue = new House();
        blue.setLawn(false);
//        System.out.println(blue.isLawn());
//        System.out.println(blue.getWindows());

        House red = new House();
        House green = new House(4);
        House purple = new House(3,2,"round",false);

//        System.out.println(red.sum(3,4,6));
//        System.out.println(blue);
        System.out.println("windows " + blue.getWindows());
        System.out.println("doors " + blue.getDoors());
        System.out.println("roof type " + blue.getTypeOfRoof());
        System.out.println("has a lawn " + blue.isLawn());
    }
}


