package carEngine;

public class Car {

	String carModel;
	String brand;
	Engine engine;

	Car(String carModel, String brand, Engine engine) {
		this.carModel = carModel;
		this.brand = brand;
		this.engine = engine;
	}

	void displayCar() {
		System.out.println("Car Model: " + carModel);
		System.out.println("Brand: " + brand);
		engine.displayEngine();
	}
}

class Engine {

	String engineNumber;
	String engineType;

	Engine(String engineNumber, String engineType) {
		this.engineNumber = engineNumber;
		this.engineType = engineType;
	}

	void displayEngine() {
		System.out.println("Engine Number: " + engineNumber);
		System.out.println("Engine Type: " + engineType);
	}
}