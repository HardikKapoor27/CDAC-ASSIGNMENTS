package onlineShoppingDiscount;

public class DiscountTest {

	public static void main(String[] args) {

		System.out.println("=================================");
		System.out.println("   ONLINE SHOPPING DISCOUNT");
		System.out.println("=================================");

		double price = 5000;

		System.out.println("\nOriginal Price : ₹" + price);

		System.out.println("\n----- FESTIVAL DISCOUNT (20%) -----");

		Discount festival = new FestivalDiscount();
		double festivalPrice = festival.calculateDiscount(price);

		System.out.println("Final Price : ₹" + festivalPrice);


		System.out.println("\n----- SEASONAL DISCOUNT (10%) -----");

		Discount seasonal = new SeasonalDiscount();
		double seasonalPrice = seasonal.calculateDiscount(price);

		System.out.println("Final Price : ₹" + seasonalPrice);

	}
}