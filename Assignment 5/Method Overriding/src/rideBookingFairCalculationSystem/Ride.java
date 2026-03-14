package rideBookingFairCalculationSystem;

public class Ride {

	int rideId;
	String passengerName;

	Ride(int rideId, String passengerName) {
		this.rideId = rideId;
		this.passengerName = passengerName;
	}

	void calculateFare(double distance) {
		System.out.println("Calculating Fare...");
	}

	void displayRideDetails(String rideType, double distance, double fare) {

		System.out.println("\n----------- RIDE DETAILS -----------");
		System.out.println("Ride Type       : " + rideType);
		System.out.println("Ride ID         : " + rideId);
		System.out.println("Passenger Name  : " + passengerName);
		System.out.println("Distance Travel : " + distance + " km");
		System.out.println("Total Fare      : ₹" + fare);
	}
}

class BikeRide extends Ride {

	double fare;

	BikeRide(int rideId, String passengerName) {
		super(rideId, passengerName);
	}

	void calculateFare(double distance) {

		double ratePerKm = 8;

		fare = distance * ratePerKm;

		displayRideDetails("Bike Ride", distance, fare);
	}
}

class CabRide extends Ride {

	double fare;

	CabRide(int rideId, String passengerName) {
		super(rideId, passengerName);
	}

	void calculateFare(double distance) {

		double baseFare = 50;
		double ratePerKm = 15;

		fare = baseFare + (distance * ratePerKm);

		displayRideDetails("Cab Ride", distance, fare);
	}
}

class AutoRide extends Ride {

	double fare;

	AutoRide(int rideId, String passengerName) {
		super(rideId, passengerName);
	}

	void calculateFare(double distance) {

		double baseFare = 30;
		double ratePerKm = 10;

		fare = baseFare + (distance * ratePerKm);

		displayRideDetails("Auto Ride", distance, fare);
	}
}