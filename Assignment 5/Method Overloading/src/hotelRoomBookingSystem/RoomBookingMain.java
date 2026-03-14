package hotelRoomBookingSystem;

public class RoomBookingMain {

	public static void main(String[] args) {

		RoomBooking r = new RoomBooking();

		r.takeInput();

		int costPerDay = 1500;
		int foodCharges = 500;

		r.calculateCost(r.days);
		r.calculateCost(r.days, costPerDay);
		r.calculateCost(r.days, costPerDay, foodCharges);

	}
}