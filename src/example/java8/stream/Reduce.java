package example.java8.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {

	public static void main(String[] args) {
		Stream<Integer> numbersSum = Stream.of(1,2,3,4,5);
		Stream<Integer> numbersMax = Stream.of(1,11,30,56,50);
		
		  Optional<Integer> intOptional = numbersSum.reduce((i, j) -> i + j);
		  if(intOptional.isPresent()) System.out.println("Résultat Sum= " +
		  intOptional.get());
		 
		
		Optional<Integer> intMaxOptional = numbersMax.reduce((i, j) -> i > j ? i : j);
		
		if(intMaxOptional.isPresent()) 
			System.out.println("Résultat Max = " + intMaxOptional.get());
	}

}
