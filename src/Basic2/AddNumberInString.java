package Basic2;

import java.util.Scanner;

public class AddNumberInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string statement");
		String statement = sc.nextLine();
		char[] str = statement.toCharArray();
		int sum=0;
		for(int i=0;i<str.length;i++) {
			if (Character.isDigit(str[i])) {
				sum+=str[i];
			}
		}
		System.out.println("Sum of numeric String in the String is:-"+sum);
		sc.close();
	}
}
