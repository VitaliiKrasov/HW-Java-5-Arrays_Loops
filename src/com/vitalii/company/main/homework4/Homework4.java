package com.vitalii.company.main.homework4;

import java.util.Scanner;

/**
 * Create class Homework4 with fields type, year of production and engine capacity.
 * Create and initialize four instances of class Homework4.
 * Display cars certain model year  (enter year in the console);
 * ordered by the field year.
 */
public class Homework4 {

    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("A", 2002, 1400);
        cars[1] = new Car("B", 1998, 2500);
        cars[2] = new Car("B", 2002, 3200);
        cars[3] = new Car("C", 2018, 4000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println(getByYear(cars,year));
    }

    static String getByYear(Car[] cars, int year) {
        String result;
        result = "";
        for (int i = 0; i < cars.length ; i++) {
            if(cars[i].productionYear == year) {
                result += String.format("\ntype, %1$s, year of production %2$s, and engine capacity %3$s",
                        cars[i].type, cars[i].productionYear, cars[i].engineCapacity);
            }
        }
        return result;
    }

    static class Car {
        String type;
        int productionYear;
        int engineCapacity;

        public Car(String type, int roductionYear, int engineCapacity) {
            this.type = type;
            this.productionYear = roductionYear;
            this.engineCapacity = engineCapacity;
        }
    }
}
