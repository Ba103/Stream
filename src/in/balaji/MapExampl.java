package in.balaji;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExampl {
	
	public static void main(String[] args) {
		
		//Map<Employee,String>= new HashMap<>();
		
		List<String> list= Arrays.asList("anand","balaji","raji");
		List<String> listup =list.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
		System.out.println(listup);
		
		List<String> listLow =list.stream().map(e -> e.toLowerCase()).collect(Collectors.toList());
		System.out.println(listLow);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("", 1);
		map.put("Raji", 2);
		map.put("Raji ", 3);
		map.put("Balaji", 4);
		map.put("", 5);
		
		System.out.println(map);
		
		List<Integer> list1 = Arrays.asList(10,70,90,10,70,50,10,40,10);
		//Integer sech =list1.stream().sorted(Collections.reverseOrder()).distinct().skip(4).findFirst().get();
		Integer sech2 =	list1.stream().sorted().distinct().findFirst().get();
		
		//System.out.println(sech);
		System.out.println(sech2);
		
	
		
	}

}

class Emp{
	
	public Integer id;
	public String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
}
