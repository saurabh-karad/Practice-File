package Basic2;

import java.util.Scanner;

public class SumOfFirstNPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		boolean isPrime=true;
		int ctr=0;
		int sum=0;
		for(int i=2;i<=num;i++) {
			isPrime=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
				
			}if(isPrime) {
				ctr++;
				System.out.println(i+"is prime number");
				sum+=i;
			}
		
		}
		System.out.println("number of first number till:-"+num+"is"+ctr+"and"+"Sum is"+sum);
	}
}
