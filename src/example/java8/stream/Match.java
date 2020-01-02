package example.java8.stream;

import java.util.stream.Stream;

public class Match {

	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		
		System.out.println("Stream Contient 4 ? " + numbers.anyMatch(i -> i == 4));

	}

}
