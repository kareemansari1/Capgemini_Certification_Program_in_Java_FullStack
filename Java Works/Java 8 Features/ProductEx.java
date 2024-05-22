package Java8Features;

import java.util.function.BiFunction;

// Class representing a product with name and price
class Product {
	private String name;
	private int price;

	// Default constructor
	public Product() {
		name = "";
		price = 0;
	}

	// Parameterized constructor
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// Getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class ProductEx {
	public static void main(String[] args) {
		// Using method reference to constructor

		// *** Parameterized Constructor ***//
		System.out.println("Parameterized Constructor");

		// BiFunction to reference parameterized constructor of Product class
		BiFunction<String, Integer, Product> productConstructor = Product::new;

		// Creating a new Product object using method reference
		Product product = productConstructor.apply("Apple Iphone", 1500);

		// Output the name and price of the created product
		System.out.println(product.getName());
		System.out.println(product.getPrice());

		// Creating a product using traditional constructor invocation
		Product p = new Product("Laptop", 50000);
		System.out.println(p.getName());
		System.out.println(p.getPrice());

		// *** Default Constructor ***//
		System.out.println("Default Constructor");

		// BiFunction to reference default constructor of Product class
		BiFunction<String, Integer, Product> productConstructor1 = Product::new;

		// Creating a new Product object using method reference to default constructor
		Product product1 = productConstructor1.apply("Apple Tablet", 1500);

		// Output the name and price of the created product
		System.out.println(product1.getName());
		System.out.println(product1.getPrice());
	}
}
