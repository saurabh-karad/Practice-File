package Basic2;

import java.util.Arrays;
import java.util.Scanner;

public class rowsAndCol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row:");
		int row = sc.nextInt();
		System.out.println("Enter the column");
		int col = sc.nextInt();
		
		int matrix[][] = new int[row][col];
		int row_length=matrix[0].length;
		int col_length=matrix[1].length;
		
		for(int i=0;i<=row_length-1;i++) {
			for(int j=0;j<=col_length-1;j++) {
				matrix[i][j]=sc.nextInt();
				
		}
		}
		for(int i=0;i<row_length;i++) {
			for(int j=0;j<col_length;j++) {
			System.out.println(matrix[i][j]);
			}
		}
		
		
	}
}
