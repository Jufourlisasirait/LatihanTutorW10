package model;

public class Car implements Vehicle {
    private double mileage;

    public Car(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public double calculateFuel() {
        return mileage;
    }
}
