package example.java8.stream;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number = Arrays.asList(2,3,4,5);
		number.stream().map(x->x*x).forEach(y->System.out.println(y));

	}

}
