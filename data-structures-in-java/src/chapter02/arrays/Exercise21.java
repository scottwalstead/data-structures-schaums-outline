package chapter02.arrays;

import java.util.BitSet;
import java.util.Vector;


/**  Exercise 2.21
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */


public class Exercise21 {

	// Repeat Problem 2.19 using a java.util.BitSet object.
	
	public static void main(String[] args) {
	    BitSet result = sieve(1000);
		result.stream().forEach(System.out::println);
	}
	
	public static BitSet sieve(int size) {
		BitSet p = new BitSet(size);
				
		for (int i=2; i<size; i++) {
			if (isPrimeNumber(i)) p.set(i);
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