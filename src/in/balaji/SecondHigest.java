package in.balaji;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHigest {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,70,90,10,70,50,10,40,10,20,75);
		
		//second higest number
		int sech =list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(sech);
		
		// second lowest number
		int secl = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secl);
		
		double d=list.stream().map(e -> e*e).filter(e -> e>=100).mapToInt(e ->e).average().getAsDouble();
		System.out.println(d);
		
		
		 
		
	}

}
