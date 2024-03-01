package in.balaji;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {
	public static void main(String args[]) {

		Product p1 = new Product(1, "soap", 23.00);
		Product p2 = new Product(2, "shampoo", 45.00);
		Product p3 = new Product(3, "dhal", 56.00);
		Product p4 = new Product(4, "chlli", 67.00);
		Product p5 = new Product(5, "masala", 90.00);

		List<Product> list = Arrays.asList(p1, p2, p3, p4, p5);
		Optional<Product> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.price)));
		System.out.println("Max price :: " + max.get().price);

		Optional<Product> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.price)));
			
		if(min.isPresent()) {
			System.out.println("min price :: " + min.get().price);
		}
		
		Optional<Product> secg =list.stream().sorted(Collections.reverseOrder()).skip(2).findFirst();
		System.out.println(secg);
		
		
		double avg = list.stream().collect(Collectors.averagingDouble(e -> e.price));
		System.out.println(avg);

	}
}

class Product {

	Integer number;
	String Productname;
	double price;

	Product(Integer number, String Productname, double price) {
		this.number = number;
		this.Productname = Productname;
		this.price = price;
	}
}
