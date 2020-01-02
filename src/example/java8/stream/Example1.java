package example.java8.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List<Integer> maListe = new ArrayList<Integer>();
		
		for(int i = 1; i < 1000; i++) {
			maListe.add(i);
		}
		
		System.out.println("somme iterator: " + sommeIterator(maListe));
		System.out.println("somme stream: " + sommeStream(maListe));
	}
	
	/* calcul de la somme avec Iterator */
	private static long sommeIterator(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		long sum = 0L;
		while(it.hasNext()) {
			int num = it.next();
			if(num % 2 == 0) {
				sum += num;
			}
		}
		return sum;
	}
	
	/* calcul de la somme avec Stream */
	private static long sommeStream(List<Integer> list) {
		return list.stream().filter(i -> i % 2 == 0).mapToLong(i -> i).sum();
	}
}
