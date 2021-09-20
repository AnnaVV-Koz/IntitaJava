package intita;

import java.util.Scanner;

public class Car {
    private Wheels wheels[];
    private Engine engine;
    private String brand;
    private double consumption;
    private double fuel_level;

    public Car(String brand, double consumption_, Engine engine, Wheels[] wheels, double fuel_level) {
        this.brand = brand;
        this.consumption = consumption;
        this.engine = engine;
        this.wheels = wheels;
        this.fuel_level = fuel_level;
    }

    public Wheels[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheels[] wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getFuel_level() {
        return fuel_level;
    }


    public void setFuel_level(double fuel_level) {
        this.fuel_level = fuel_level;
    }
    public String toString() {
        String string;
        string = this.brand + engine.toString() + ";" + Double.toString(this.consumption )+ "L/100km { " + Double.toString(this.fuel_level) + "}; [";
        for (int i = 0; i < 4; ++i) {
            string += wheels[i].toString() + " ";
        }
        string =string + "]";
        System.out.println(string);
        return string;


    }
    public void move() {
        if (fuel_level <= 0) {
            System.out.println("No fuel, the car can not move");
            return;
        }
        for (int i = 1; i < 4; ++i) {
            if (wheels[i].getDiameter() != wheels[i - 1].getDiameter()) {
                System.out.println("Wheels of different diameters, the car can not move");
                return;
            }
        }
        double distance = fuel_level / consumption;
        System.out.println("The car drove by " + distance * 100 + "км.");
        fuel_level = 0;

    }
    public void addFuel(double value) {
        fuel_level += value;
    }
    public void change_wheel(Scanner scanner) {
        System.out.println("Input number of weel [0-3]:");
        int number;
        while (true) {
            number = scanner.nextInt();
            if (number >= 0 && number <= 3)
                break;
            System.out.println("Error");
        }
        wheels[number] = Wheels.get(scanner);
    }
}

