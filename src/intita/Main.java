package intita;

public class Main {
    public static void main(String[] args) {
        Engine [] engine = new Engine [4];
        engine[0] = new Engine(12,345);

        Wheels[] wheels = new Wheels[4]; //('BMW',12,Wheels.Type.Winter);
        wheels[0] = new Wheels("BMW",12.0,Wheels.Type.Summer);
        wheels[1] = new Wheels("BMW",12.0,Wheels.Type.Summer);
        wheels[2] = new Wheels("BMW",12.0,Wheels.Type.Summer);
        wheels[3] = new Wheels("BMW",12.0,Wheels.Type.Summer);

        Car car = new Car("BMW", 2.4, engine[1], wheels, 12);
        car.move();

        //car.toString();
        car.addFuel(34);
        //car.toString();
        //Car.addFuel(22);
        car.addFuel(45);
        car.change_wheel();
    }

}
