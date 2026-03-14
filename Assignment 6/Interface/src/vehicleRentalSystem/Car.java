package vehicleRentalSystem;

class Car implements Rental {

	int vehicleId;
	String vehicleName;
	double rentPerDay;
	double totalRent;

	Car(int vehicleId, String vehicleName, double rentPerDay) {
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.rentPerDay = rentPerDay;
	}

	public void rentVehicle(int days) {
		totalRent = calculateRent(days);
		System.out.println("\nCar Rented for " + days + " days");
	}

	public double calculateRent(int days) {

		double rent = days * rentPerDay;

		if(days > 5) {
			rent = rent - (rent * 0.10);
		}

		return rent;
	}

	public void displayDetails() {

		System.out.println("Vehicle ID   : " + vehicleId);
		System.out.println("Vehicle Name : " + vehicleName);
		System.out.println("Rent Per Day : ₹" + rentPerDay);
		System.out.println("Total Rent   : ₹" + totalRent);

	}
}