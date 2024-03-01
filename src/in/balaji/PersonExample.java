package in.balaji;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("Balaji", "India");
		Person p2 = new Person("Stoke", "England");
		Person p3 = new Person("Jadeja", "India");
		Person p4 = new Person("Lotham", "Newyark");
		Person p5 = new Person("warner", "Aus");

		List<Person> person = Arrays.asList(p1, p2, p3, p4, p5);

		Optional<Person> findfirst = person.stream().filter(p -> p.country.equals("India")).findFirst();

		if (findfirst.isPresent()) {
			System.out.println(findfirst.get());
		}
		List<Person> indians = person.stream().filter(p -> p.country.equals("India")).collect(Collectors.toList());

		List<String> person2 = person.stream().filter(p -> p.country.equals("India")).map(p -> p.name)
				.collect(Collectors.toList());

		System.out.println(indians.size());
		System.out.println(indians);
		System.out.println(person2);

	}

}

class Person {

	String name;
	String country;

	Person(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}

}
