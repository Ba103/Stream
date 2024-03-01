package in.balaji;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxAndMinSalary {
 
	public static void main(String[] args) {
		
		MaxSalary e1 = new MaxSalary(1, "Balaji", 50000.00);
		MaxSalary e2 = new MaxSalary(2, "Jagadeesh", 36000.00);
		MaxSalary e3 = new MaxSalary(3, "manju", 25000.00);
		MaxSalary e4 = new MaxSalary(4, "sai", 16000.00);
		MaxSalary e5 = new MaxSalary(5, "vinod", 10000.00);
		
		List<MaxSalary> list = Arrays.asList(e1,e2,e3,e4,e5);
		Optional<MaxSalary> max= list.stream().collect(Collectors.maxBy(Comparator.comparing(e ->e.salary)));
		System.out.println("Max salary :: " +max.get().salary);
		
		Optional<MaxSalary> min=list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		System.out.println("min salary ::" + min.get().salary);
		
		Double avg =list.stream().collect(Collectors.averagingDouble(e -> e.salary));
		
		System.out.println(avg);
		
		
	}
}

class MaxSalary {
	int id;
	String name;
	double salary;
	public MaxSalary(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}
