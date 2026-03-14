package onlineShoppingCartSystem;

public class ShoppingApp {
	
	public static void main(String[] args) {

		ProductManagement pm = new ProductManagement();

		pm.numberOfProducts();
		Product[] p = pm.getProducts();
		pm.allProductMethods(p);
	}

}
