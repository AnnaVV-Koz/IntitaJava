package intita;

public class Engine {
    private int number;
    private double power;

    public Engine(int number, double power) {
        this.number = number;
        this.power = power;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "number=" + Integer.toString(number )+
                ", power=" + Double.toString(power) +
                '}';
    }


}
//
