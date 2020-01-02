package example.java8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {

	public static void main(String[] args) {
		Stream<String> names = Stream.of("hamza", "meryem", "papi");
		
		System.out.println(names.map(s -> s.toUpperCase()).collect(Collectors.toList()));

	}

}
