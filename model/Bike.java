package model;

public class Bike implements Vehicle {
    private double mileage;
    

    public Bike(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public double calculateFuel() {
        return mileage;
    }
}
