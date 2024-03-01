package in.balaji;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class AvarageNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 20, 30, 40);
		double d1 = list.stream().map(e -> e * e).filter(e -> e >= 1600).mapToInt(e -> e).average().getAsDouble();
		System.out.println(d1);

		List<Integer> list1 = Arrays.asList(10, 70, 57, 98);
		list1.stream().filter(e -> e > 30).forEach(e -> System.out.println(e));

		List<String> names = Arrays.asList("Anushka", "Anupama", "Nagarjuna", "Balakrishna", "Ashok");
		names.stream().filter(e -> e.startsWith("A")).forEach(e -> System.out.println(e));
		
		Optional<Integer> sech  = list1.stream().sorted(Collections.reverseOrder()).skip(3).findFirst();
		System.out.println(sech);
		
		User u1 = new User(34,"Anil");
		User u2 = new User(24,"Raju");
		User u3 = new User(54,"Jagadeesh");
		User u4 = new User(66,"Ashok");
		User u5 = new User(43,"Manju");
		
		Stream<User> stream = Stream.of(u1,u2,u3,u4,u5);
		stream.filter(u ->u. age >=25 && u.name.startsWith("A")).forEach(e -> System.out.println(e));
	}

}

class User {
	int age;
	String name;

	public User(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}

}
