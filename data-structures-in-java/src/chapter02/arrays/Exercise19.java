/**
 * 
 */
package chapter02.arrays;

import java.util.Arrays;

/** Exercise 2.19
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard, 
 * Schaum�s Outline Series
 * 
 * The Sieve of Eratosthenes is an array of boolean elements whose ith element is true if and
 * only if i is a prime number. 
 * Use the following algorithm to compute and print a sieve of size 1000:
 * 1. Initialize p[0] and p[1] to be false, and all other p[i] to be true.
 * 2. Repeat step 3 for each i from 3 to n, incrementing by 2.
 * 3. If there is a prime the square root of i that divides i, set p[i] false.
 */
public class Exercise19 {

	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(sieve(11)));
	}
	
	public static boolean[] sieve(int num) {
		boolean[] arr = new boolean[num];
		arr[0] = arr[1] = false;
		for (int i=2; i<num; i++) {
			arr[i] = isPrimeNumber(i);
		}
		return arr;
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



