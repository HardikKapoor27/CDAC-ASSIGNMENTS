package vehicleRentalSystem;

class Bike implements Rental {

	int vehicleId;
	String vehicleName;
	double rentPerDay;
	double totalRent;

	Bike(int vehicleId, String vehicleName, double rentPerDay) {
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.rentPerDay = rentPerDay;
	}

	public void rentVehicle(int days) {
		totalRent = calculateRent(days);
		System.out.println("\nBike Rented for " + days + " days");
	}

	public double calculateRent(int days) {

		double rent = days * rentPerDay;

		if(days > 3) {
			rent = rent - (rent * 0.05);
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