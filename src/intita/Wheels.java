package intita;

import java.util.Scanner;

public class Wheels {
    public enum Type { Winter, Summer }

    private double diameter;
    private String brand;
    private Type type;

    public Wheels(String brand, double diameter, Type type) {
        this.brand = brand;
        this.diameter = diameter;
        this.type = type;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public String toString() {
        String string = "";

        string += brand + "(" + Double.toString(diameter)+ "): ";
        if (type == Type.Winter)
            string += "Winter";
        else
            string += "Summer";

        return string;
    }
    public static Wheels get(Scanner scanner) {
        Wheels object = new Wheels("", 0, Type.Winter);


        Scanner in  = new Scanner(System.in);
        System.out.print("Input brand:");
        String brand = in.nextLine();

        System.out.print("Input diameter: ");
        object.diameter = scanner.nextDouble();

        System.out.print("Input type (1) - winter, (2) - summer: ");
        while (true) {
            int value = scanner.nextInt();
            if (value == 1) {
                object.type = Type.Winter;
                break;
            }
            if (value == 2) {
                object.type = Type.Summer;
                break;
            }
            System.out.print("Error");
        }
        return object;
    }
}
