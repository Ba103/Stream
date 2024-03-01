package in.balaji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Balaji");
		list.add("Raji");
		list.add("Anil");
		list.add("Banu");

		list.stream().filter(e -> e.startsWith("B")).forEach(e -> System.out.println(e));
		list.stream().filter(e -> e.endsWith("i")).forEach(e -> System.out.println(e));
		
		List<String> string =Arrays.asList("springboot","Hibernate","spring","spring mvc","microservices");
		string.stream().filter(e -> e.startsWith("spring")).forEach(e -> System.out.println(e));
		
		EmployeeExample emp1 = new EmployeeExample("Balaji",24,35000);
		EmployeeExample emp2 = new EmployeeExample("Jagadeesh",44,45000);
		EmployeeExample emp3 = new EmployeeExample("Manju",34,53000);
		EmployeeExample emp4 = new EmployeeExample("sai",14,18000);
		
		List<EmployeeExample> list1 =Arrays.asList(emp1,emp2,emp3,emp4);
		//Stream<EmployeeExample> stream= Stream.of(emp,emp1,emp2,emp3);
		list1.stream().filter(e -> e.salary>=50000)
			   .map(e -> e.name +"-"+e.age).forEach(e -> System.out.println(e));
		
		
		}
}
	class EmployeeExample{
		
		String name;
		int age;
		double salary;
		
		public EmployeeExample(String name, int age, double salary) {
			this.name=name;
			this.age=age;
			this.salary=salary;
			
	}

}
