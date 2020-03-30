package com.codersbay.gerhofer.automobiles;

public class Mechanic {

    public static Double TAX = 0.13;

    public Integer hourlyRate;
    public String name;

    public Mechanic(Integer hourlyRate, String name) {
        this.hourlyRate = hourlyRate;
        this.name = name;
    }

    public Double changeOil(Car needingOilChangeCar) {
        needingOilChangeCar.oil = 100.0;
        return hourlyRate * 0.5 + hourlyRate * 0.5 * TAX;
    }

}
