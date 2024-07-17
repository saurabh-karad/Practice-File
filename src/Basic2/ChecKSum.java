package Basic2;

import java.util.Scanner;

public class ChecKSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1= sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2 = sc.nextInt();
		System.out.println("Enter the Third Number:");
		int num3 = sc.nextInt();
		
		int a = num1+num2;
		int b = num2+num3;
		int c = num1+num3;
		
		String result = a>num3 ? "Sum of Num1 and Num2 is Greater than num3":"Sum is not greater than num3";
		String result1 = b>num1 ? "sum is greater than num2":"Sum is not greater than num2";
		String res = c>num2 ? "sum is greater than num2":"sum is nt greater than num2";
		
		
	}

}
