package example.java8.lambda;

public class Lambda {

	public static void main(String[] args) {
		
		// expression lambda
		Interface1 i = (String s, int j) -> {
			System.out.println("premier arg :: " + s);
			System.out.println("deuxième arg :: " + j);
		};
		
		i.method1("Now", 7);
		
		
		// expression lambda simple () ni ()
		Interface2 i2 = str -> System.out.println("Ok : " + str);
		
		i2.methode2("simple");
	}

}
