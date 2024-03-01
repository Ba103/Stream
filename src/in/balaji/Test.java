package in.balaji;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<EmployeeDetails> emp = new ArrayList<EmployeeDetails>();

		emp.add(new EmployeeDetails(1, "Balaji", 25, "male", "HR", 2021, 25000.00));
		emp.add(new EmployeeDetails(2, "Manju", 26, "male", "sales", 2002, 45000.00));
		emp.add(new EmployeeDetails(3, "Raji", 45, "female", "Infrastructure", 2020, 15000.00));
		emp.add(new EmployeeDetails(4, "Bindhu", 35, "female", "manager", 2004, 55000.00));
		emp.add(new EmployeeDetails(5, "Jagadeesh", 35, "male", "HR", 2023, 35000.00));
		emp.add(new EmployeeDetails(6, "Sindhu", 55, "female", "HR", 2022, 46000.00));
		emp.add(new EmployeeDetails(7, "Sindhuja", 55, "female", "sales", 2020, 16000.00));

		Map<String, Long> map1 = emp.stream()
				.collect(Collectors.groupingBy(EmployeeDetails::getGender, Collectors.counting()));
		System.out.println(map1);
		
		Optional<EmployeeDetails> maxSal =emp.stream().collect(Collectors.maxBy(Comparator.comparingDouble(EmployeeDetails :: getSalary)));
		if(maxSal.isPresent()){
			System.out.println(maxSal);
		}
		List<EmployeeDetails> emplist=emp.stream().filter((e)-> e.getDepartment().equals("sales")&& e.getSalary()>=45000).collect(Collectors.toList());
		System.out.println(emplist);
		Optional<EmployeeDetails> max = emp.stream()
			
				.collect(Collectors.maxBy(Comparator.comparing(EmployeeDetails::getSalary)));

		if (max.isPresent()) {
			System.out.println(max);
		}

		Map<Integer, Long> map = emp.stream()
				.collect(Collectors.groupingBy(EmployeeDetails::getAge, Collectors.counting()));
		System.out.println(map);

		emp.stream().filter(e -> e.yearOfJoining >= 2022).forEach(e -> System.out.println(e));

		Double map2 = emp.stream().collect(Collectors.averagingDouble(EmployeeDetails::getSalary));
		System.out.println(map2);

		Map<String, Long> map3 = emp.stream()
				.collect(Collectors.groupingBy(EmployeeDetails::getDepartment, Collectors.counting()));
		System.out.println(map3);

		//
		Map<String, Long> map4 = emp.stream()
				.collect(Collectors.groupingBy(EmployeeDetails::getGender, Collectors.counting()));
		System.out.println(map4);

		// to get the all department names
		emp.stream().map(EmployeeDetails::getDepartment).distinct().forEach(e -> System.out.println(e));

		Map<String, Double> map5 = emp.stream().collect(
				Collectors.groupingBy(EmployeeDetails::getGender, Collectors.averagingInt(EmployeeDetails::getAge)));
		;
		System.out.println(map5);

		Optional<EmployeeDetails> empd = emp.stream()
				.collect(Collectors.minBy(Comparator.comparing(EmployeeDetails::getSalary)));

		if (empd.isPresent()) {
			System.out.println(empd);
		}

		Optional<EmployeeDetails> l = emp.stream()
				.collect(Collectors.minBy(Comparator.comparing(EmployeeDetails::getYearOfJoining)));
		if (l.isPresent()) {
			System.out.println(l);
		}

		Map<String, Long> emp8 = emp.stream().filter(e -> e.getDepartment().equals("sales"))
				.collect(Collectors.groupingBy(EmployeeDetails::getGender, Collectors.counting()));
		System.out.println(emp8);
	}

}

class EmployeeDetails {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public EmployeeDetails(int id, String name, int age, String gender, String department, int yearOfJoining,
			double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

}
