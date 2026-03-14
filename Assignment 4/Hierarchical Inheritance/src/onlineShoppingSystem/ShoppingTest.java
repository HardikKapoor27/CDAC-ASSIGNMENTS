package onlineShoppingSystem;

class ShoppingTest {

	public static void main(String[] args) {

		Electronics e = new Electronics(101, "Laptop", 65000, 2);
		e.displayProduct();
		e.displayWarrantyPeriod();

		System.out.println();

		Clothing c = new Clothing(201, "T-Shirt", 999, "S, M, L, XL");
		c.displayProduct();
		c.displaySizeOptions();
	}
}