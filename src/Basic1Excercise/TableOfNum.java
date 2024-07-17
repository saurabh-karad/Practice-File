package Basic1Excercise;

import java.util.Scanner;

public class TableOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int TableOfNum=0;
		do {
			System.out.println("Table of given num:"+(TableOfNum+=num));
		}
		while(num<num*10); 
	}

}
