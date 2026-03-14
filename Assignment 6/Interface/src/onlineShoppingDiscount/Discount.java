package onlineShoppingDiscount;

interface Discount {

	double calculateDiscount(double price);

}

class FestivalDiscount implements Discount {

	public double calculateDiscount(double price) {

		double discount = price * 0.20;
		return price - discount;

	}
}

class SeasonalDiscount implements Discount {

	public double calculateDiscount(double price) {

		double discount = price * 0.10;
		return price - discount;

	}
}