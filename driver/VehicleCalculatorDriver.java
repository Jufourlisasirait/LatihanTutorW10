package driver;

import java.util.Scanner;

import model.Bike;
import model.Car;
import model.Vehicle;
import model.ShapeType;

public class VehicleCalculatorDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle car = new Car(30); // Mileage in miles per gallon
        Vehicle bike = new Bike(50); // Mileage in miles per gallon

        System.out.println("Pilih kendaraan (0: Mobil, 1: Sepeda Motor): ");
        int choice = scanner.nextInt();
        ShapeType shapeType = ShapeType.values()[choice];

        switch (choice) {
            case 0:
                shapeType = ShapeType.CAR;
                break;
            case 1:
                shapeType = ShapeType.BIKE;
                break;
            default:
                System.out.println("Invalid Choice!");
                break;
        }

        if (shapeType == ShapeType.CAR) {
            System.out.println("The car has an average fuel consumption of " + calculateFuel(car) + " miles per gallon");
        } else if (shapeType == ShapeType.BIKE) {
            System.out.println("Moto bikes have an average fuel consumption of " + calculateFuel(bike) + " miles per gallon");
        }

        scanner.close();
    }

    private static double calculateFuel(Vehicle vehicle) {
        return vehicle.calculateFuel();
    }
}