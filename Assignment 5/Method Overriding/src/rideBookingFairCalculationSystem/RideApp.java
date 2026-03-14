package rideBookingFairCalculationSystem;

public class RideApp {

	public static void main(String[] args) {

		System.out.println("=============== RIDE BOOKING SYSTEM ===============");
		
		System.out.println("\n=========== BIKE RIDE BOOKING ===========");

		BikeRide bike = new BikeRide(101, "Hardik");
		bike.calculateFare(12);


		System.out.println("\n=========== CAB RIDE BOOKING ===========");

		CabRide cab = new CabRide(102, "Virat");
		cab.calculateFare(18);


		System.out.println("\n=========== AUTO RIDE BOOKING ===========");

		AutoRide auto = new AutoRide(103, "Rohit");
		auto.calculateFare(10);

	}
}