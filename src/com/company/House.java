package com.company;

public class House {

    private int windows;
    private int doors;
    private String typeOfRoof;
    private boolean lawn;


    public House(){

    }

    public House(int windows) {
        this.windows = windows;
    }

    public House(int windows, int doors, String typeOfRoof, boolean lawn) {
        this.windows = windows;
        this.doors = doors;
        this.typeOfRoof = typeOfRoof;
        this.lawn = lawn;
    }



    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public String getTypeOfRoof() {
        return typeOfRoof;
    }

    public boolean isLawn() {
        return lawn;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setTypeOfRoof(String typeOfRoof) {
        this.typeOfRoof = typeOfRoof;
    }

    public void setLawn(boolean lawn) {
        this.lawn = lawn;
    }

    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    @Override
    public String toString() {
        return super.toString() + " This house has " + windows + " windows and "
                + doors + " doors, the roof on this house is " + typeOfRoof;
    }
}
