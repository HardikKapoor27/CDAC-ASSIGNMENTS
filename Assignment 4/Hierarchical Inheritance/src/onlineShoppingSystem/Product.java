package onlineShoppingSystem;

public class Product {

	int productId;
	String productName;
	double price;

	public Product(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	void displayProduct() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
	}
}

class Electronics extends Product {

	int warrantyYears;

	public Electronics(int productId, String productName, double price, int warrantyYears) {
		super(productId, productName, price);
		this.warrantyYears = warrantyYears;
	}

	void displayWarrantyPeriod() {
		System.out.println("Warranty Period: " + warrantyYears + " years");
	}
}

class Clothing extends Product {

	String sizeOptions;

	public Clothing(int productId, String productName, double price, String sizeOptions) {
		super(productId, productName, price);
		this.sizeOptions = sizeOptions;
	}

	void displaySizeOptions() {
		System.out.println("Available Sizes: " + sizeOptions);
	}
}