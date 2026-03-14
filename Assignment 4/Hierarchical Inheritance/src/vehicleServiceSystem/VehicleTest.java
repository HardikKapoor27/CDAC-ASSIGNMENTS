package vehicleServiceSystem;

class VehicleTest {

	public static void main(String[] args) {

		Car c = new Car("KA01AB1234", "Toyota", 5000);
		c.displayVehicle();
		c.calculateServiceCost();

		System.out.println();

		Bike b = new Bike("KA05XY7890", "Honda", 1500);
		b.displayVehicle();
		b.calculateServiceCost();
	}
}