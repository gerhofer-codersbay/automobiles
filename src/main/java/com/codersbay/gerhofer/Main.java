package com.codersbay.gerhofer;

import com.codersbay.gerhofer.automobiles.Car;
import com.codersbay.gerhofer.automobiles.Mechanic;

public class Main {

    public static void main(String[] args) {
        Car twingo = new Car("Renault", "Twingo", "turquise", 1998, "Zulassung", "standard motor", 4, 80.0);

        Mechanic oeamtcMechanic = new Mechanic(60, "ÖAMTC mechanic");
        Double priceForOilChange = oeamtcMechanic.changeOil(twingo);
        System.out.printf("Oil change with %s costs %.2f\n", oeamtcMechanic.name, priceForOilChange);

        Mechanic friendlyMechanic = new Mechanic(40, "mechanic from next door");
        priceForOilChange = friendlyMechanic.changeOil(twingo);
        System.out.printf("Oil change with %s costs %.2f\n", friendlyMechanic.name, priceForOilChange);

        Calculator.add(7, 8);
    }

}
