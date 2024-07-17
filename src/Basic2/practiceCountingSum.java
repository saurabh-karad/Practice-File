package Basic2;

import java.util.Scanner;

public class practiceCountingSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number:");
       int num=sc.nextInt();
       int ctr=0;
       boolean isPrime=true;
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
    		   if(ctr==100) {
    			   sum+=i;
    		   }
    	   System.out.println(i+"is a prime number");
    	   }
       }System.out.println("Sum of prime number is:-"+sum+"and"+"counter is:-"+ctr);
	}

}
