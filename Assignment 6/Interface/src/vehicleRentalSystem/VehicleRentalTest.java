package vehicleRentalSystem;

public class VehicleRentalTest {

	public static void main(String[] args) {

		System.out.println("=================================");
		System.out.println("       VEHICLE RENTAL SYSTEM");
		System.out.println("=================================");

		System.out.println("\n----- CAR RENTAL -----");

		Car car = new Car(101, "Hyundai Creta", 2000);
		car.rentVehicle(7);
		car.displayDetails();


		System.out.println("\n----- BIKE RENTAL -----");

		Bike bike = new Bike(201, "Royal Enfield", 800);
		bike.rentVehicle(4);
		bike.displayDetails();

	}
}