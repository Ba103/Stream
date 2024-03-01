package in.balaji;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	
	public static void main(String[] args) {
		
		List<String>name =Arrays.asList("Balaji","Raji","Gowtham","Banu","Ashok","Broad");
		
		name.stream().filter(e -> e.startsWith("B"))
		//.map(e ->e  +"-" +e.length())
		.forEach(e -> System.out.println(e));
	}

}
