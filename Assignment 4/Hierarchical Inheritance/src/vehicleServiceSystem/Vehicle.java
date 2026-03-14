package vehicleServiceSystem;

public class Vehicle {

	String vehicleNumber;
	String brand;

	public Vehicle(String vehicleNumber, String brand) {
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
	}

	void displayVehicle() {
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("Brand: " + brand);
	}
}

class Car extends Vehicle {

	double serviceCost;

	public Car(String vehicleNumber, String brand, double serviceCost) {
		super(vehicleNumber, brand);
		this.serviceCost = serviceCost;
	}

	void calculateServiceCost() {
		System.out.println("Car Service Cost: " + serviceCost);
	}
}

class Bike extends Vehicle {

	double serviceCost;

	public Bike(String vehicleNumber, String brand, double serviceCost) {
		super(vehicleNumber, brand);
		this.serviceCost = serviceCost;
	}

	void calculateServiceCost() {
		System.out.println("Bike Service Cost: " + serviceCost);
	}
}