package computerProcessor;

public class Computer {

	String brand;
	String model;
	Processor processor; // HAS-A relationship

	public Computer(String brand, String model, Processor processor) {
		this.brand = brand;
		this.model = model;
		this.processor = processor;
	}

	void displayComputer() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		processor.displayProcessor();
	}
}

class Processor {

	String processorName;
	double speed;

	public Processor(String processorName, double speed) {
		this.processorName = processorName;
		this.speed = speed;
	}

	void displayProcessor() {
		System.out.println("Processor Name: " + processorName);
		System.out.println("Speed: " + speed + " GHz");
	}
}