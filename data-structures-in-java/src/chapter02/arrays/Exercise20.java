package chapter02.arrays;

import java.util.Arrays;
import java.util.Vector;

/**  Exercise 2.20
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */


public class Exercise20 {

	// Repeat Problem 2.19 using a java.util.Vector object.
	
	public static void main(String[] args) {
		Vector<Boolean> result = sieve(1000);
		result.stream().forEach(System.out::println);
	}
	
	public static Vector<Boolean> sieve(int size) {
		Vector<Boolean> p = new Vector<>();
		p.add(0, false);
		p.add(1, false);
		for (int i=2; i<size; i++) {
			p.add(i, isPrimeNumber(i));
		}
		return p;
	}

	public static boolean isPrimeNumber(int i) {
        int factors = 0;
        int j = 1;

        while(j <= i) {
            if(i % j == 0){
                factors++;
            }
            j++;
        }
        return (factors == 2);
	}
	
	

}
