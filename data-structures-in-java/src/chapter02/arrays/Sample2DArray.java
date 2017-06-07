
package chapter02.arrays;

import java.util.Random;

/**  Generates a sample 2D Rectangular 2D Array
 * dimensions of array are given as row and col 
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Sample2DArray {

	private int row;
	private int col;
	private int[][] arr; // declaration
	
	public Sample2DArray(int row, int col) {
		this.row = row;
		this.col = col;
		this.arr = new int[row][col]; // initialize the array
		Random ran = new Random();
		// allocating the elements
		for (int i = 0; i < row; i++) { 
			for (int j = 0; j < col; j++) { 
				arr[i][j] = ran.nextInt(10); 
			} 
		}
	}
	
	
	public int[][] getArr() {
		return arr;
	}


	public void display() {
		for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println("");
        }
	}
	
}
