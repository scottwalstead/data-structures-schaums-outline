/**
 * 
 */
package chapter02.arrays;

import java.util.Random;

/**  Generates a sample 2D Rectangular 2D Array 
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Sample2DArray {

	private int row;
	private int col;
	public Sample2DArray(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public int[][] getArray() {
		Random ran = new Random(10);
		int[][] arr = new int[row][col];
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++){
				arr[i][j] = ran.nextInt();
			}
		}
		return arr;
	}
	
	public void display(int[][] arr) {
		for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println("");
        }
	}
	
}
