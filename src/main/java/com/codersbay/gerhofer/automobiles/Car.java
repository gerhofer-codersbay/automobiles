package com.codersbay.gerhofer.automobiles;

public class Car {

    public String brand;
    public String model;
    public String color;
    private Integer year;
    private String admittance; // zulassung

    String motor;
    Integer cylinderCount;
    Double oil;

    public Car(String brand, String model, String color, Integer year, String admittance, String motor, Integer cylinderCount, Double oil) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.admittance = admittance;
        this.motor = motor;
        this.cylinderCount = cylinderCount;
        this.oil = oil;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }
}
