package example.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		List result = names.stream().sorted().collect(Collectors.toList());

		System.out.println(result);
		
		result.forEach(res -> System.out.println(res));
	}

}
